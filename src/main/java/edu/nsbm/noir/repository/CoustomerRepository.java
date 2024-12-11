package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
