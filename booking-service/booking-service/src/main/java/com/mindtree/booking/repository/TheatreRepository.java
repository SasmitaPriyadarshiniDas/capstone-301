package com.mindtree.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.Theatre;

@Repository
public interface TheatreRepository extends MongoRepository<Theatre, Long> {
	Theatre findByTheatreId(Long theatreId);

	Theatre findByTheatreNameAndTheatreCity(String theatreName, String theatreCity);

}
