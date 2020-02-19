package com.mindtree.booking.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.booking.model.Movie;
import com.mindtree.booking.model.MovieScreening;
import com.mindtree.booking.model.Screening;
import com.mindtree.booking.model.Theatre;
import com.mindtree.booking.repository.MovieRepository;
import com.mindtree.booking.repository.ScreenRepository;
import com.mindtree.booking.repository.ScreeningRepository;
import com.mindtree.booking.repository.TheatreRepository;
import com.mindtree.booking.repository.TicketRepository;

@Service
public class ScreeningServiceImpl implements ScreeningService {

	@Autowired
	private ScreeningRepository screeningRepository;

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private TheatreRepository theatreRepository;

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private ScreenRepository screenRepository;

	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Screening getScreening(MovieScreening movieScreening) {

		Theatre theatre = theatreRepository.findByTheatreNameAndTheatreCity(movieScreening.getTheatreName(),
				movieScreening.getTheatreCity());
		if (theatre == null)
			return null;
		return screeningRepository.findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime(
				movieScreening.getMovieName(), theatre.getId(),
				java.sql.Date.valueOf(movieScreening.getScreeningDate()),
				java.sql.Time.valueOf(movieScreening.getScreeningTime()));
	}

	@Override
	public int bookSeats(MovieScreening movieScreening, int seats) {
		Screening screening = getScreening(movieScreening);
		screening.setBookedTickets(seats);
		screeningRepository.save(screening);
		return getBookedSeats(movieScreening);
	}

	@Override
	public int getBookedSeats(MovieScreening movieScreening) {
		Screening screening = getScreening(movieScreening);
		return screening.getBookedTickets();
	}

	@Override
	public int getTotalSeats(MovieScreening movieScreening) {
		Screening screening = getScreening(movieScreening);
		long screenId = screening.getScreenId();
		return screenRepository.findByScreenId(screenId).getSeatsNum();
	}

	@Override
	public Set<Movie> getMoviesByDate(Date date) {

		Iterable<Screening> screenings = screeningRepository.findByScreeningDate(new java.sql.Date(date.getTime()));
		Set<Movie> movies = new HashSet<>();

		if (screenings != null) {
			for (Screening screening : screenings) {
				Movie movie = movieRepository.findByMovieName(screening.getMovieName());
				movies.add(movie);
			}
		}

		return movies;
	}

	@Override
	public List<Screening> getScreeningsByMovie(String movieName) {
		List<Screening> screening = (List<Screening>) screeningRepository.findByMovieName(movieName);
		return screening;
	}

	@Override
	public List<MovieScreening> getMovieScreeningsByMovie(String movieName) {

		Iterable<Screening> screenings = (Iterable<Screening>) this.screeningRepository.findByMovieName(movieName);
		List<MovieScreening> movieScreenings = new ArrayList<>();

		if (screenings != null) {
			for (Screening screening : screenings) {
				MovieScreening movieScreening = new MovieScreening();
				Theatre theatre = theatreRepository.findByTheatreId(screening.getTheatreId());
				Movie movie = movieRepository.findByMovieName(screening.getMovieName());

				movieScreening.setMovieName(screening.getMovieName());
				movieScreening.setMoviePosterURL(movie.getMoviePosterUrl());

				if (theatre != null) {
					movieScreening.setTheatreId(theatre.getId());
					movieScreening.setTheatreName(theatre.getName());
					movieScreening.setTheatreCity(theatre.getCity());
				}

				movieScreening.setScreeningDate(screening.getScreeningDate().toString());
				movieScreening.setScreeningTime(screening.getScreeningTime().toString());
				movieScreenings.add(movieScreening);
			}
		}

		return movieScreenings;
	}

}
