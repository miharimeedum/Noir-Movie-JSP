package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<SeatEntity, Integer> {
}
