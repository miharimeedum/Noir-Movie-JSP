package edu.nsbm.noir.repository;

import edu.nsbm.noir.entiy.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
}
