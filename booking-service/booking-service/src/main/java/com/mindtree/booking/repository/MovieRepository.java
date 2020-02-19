package com.mindtree.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{
	
	Movie findByMovieName(String movieName);
    Movie findByMovieId(long movieId);

}
