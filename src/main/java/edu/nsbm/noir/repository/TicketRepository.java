package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
