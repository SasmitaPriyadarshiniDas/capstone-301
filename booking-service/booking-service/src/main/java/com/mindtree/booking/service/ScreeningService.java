package com.mindtree.booking.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mindtree.booking.model.MovieScreening;
import com.mindtree.booking.model.Screening;
import com.mindtree.booking.model.Movie;;

public interface ScreeningService {

	public Screening getScreening(MovieScreening movieScreening);

	public int bookSeats(MovieScreening movieScreening, int seats);

	public int getBookedSeats(MovieScreening movieScreening);

	public int getTotalSeats(MovieScreening movieScreening);

	public Set<Movie> getMoviesByDate(Date date);

	public List<Screening> getScreeningsByMovie(String movieName);

	public List<MovieScreening> getMovieScreeningsByMovie(String movieName);

}
