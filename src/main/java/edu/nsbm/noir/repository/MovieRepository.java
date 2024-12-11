package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
}
