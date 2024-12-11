package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchduleRepository extends JpaRepository<ScheduleEntity, Integer> {
}
