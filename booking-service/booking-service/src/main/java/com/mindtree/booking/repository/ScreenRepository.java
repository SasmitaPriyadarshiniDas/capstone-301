package com.mindtree.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.Screen;

@Repository
public interface ScreenRepository extends MongoRepository<Screen, Long> {

	public Screen findByScreenId(long screenId);

	public List<Screen> findByTheatreId(long theatreId);
}
