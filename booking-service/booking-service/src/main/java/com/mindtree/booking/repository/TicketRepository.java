package com.mindtree.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.Ticket;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, Long> {
	List<Ticket> findByScreeningId(long screeningId);

}
