package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewEntity,Integer> {
}
