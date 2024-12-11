package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.PaymentEntity;
import edu.nsbm.noir.model.Payment;
import edu.nsbm.noir.repository.PaymentRepository;
import edu.nsbm.noir.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class PaymentSeviceImpl implements PaymentService {
    final PaymentRepository paymentRepository;
    final ModelMapper modelMapper;
    @Override
    public void addPayment(Payment payment) {
        paymentRepository.save(modelMapper.map(payment, PaymentEntity.class));
    }
}
