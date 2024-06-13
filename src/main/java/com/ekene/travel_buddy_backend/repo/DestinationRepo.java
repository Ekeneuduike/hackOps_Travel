package com.ekene.travel_buddy_backend.repo;

import com.ekene.travel_buddy_backend.dao.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepo extends JpaRepository<Destination,String> {
}
