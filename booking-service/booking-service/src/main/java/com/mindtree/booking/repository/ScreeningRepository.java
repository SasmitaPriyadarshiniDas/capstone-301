package com.mindtree.booking.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.Screen;
import com.mindtree.booking.model.Screening;

@Repository
public interface ScreeningRepository extends MongoRepository<Screening, Long> {

	public Screening findByMovieName(String movieName);
	public Screen findByScreenId(long screenId);

	public List<Screen> findByTheatreId(long theatreId);
	public Iterable<Screening> findByScreeningDate(Date date);
	
	public Screening findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime(String movieName, long id,Date screeningDate, Time screeningTime);

}
