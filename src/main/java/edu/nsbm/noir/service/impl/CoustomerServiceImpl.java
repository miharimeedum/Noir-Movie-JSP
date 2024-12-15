package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.CustomerEntity;
import edu.nsbm.noir.model.Customer;
import edu.nsbm.noir.repository.CoustomerRepository;
import edu.nsbm.noir.service.CoustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class CoustomerServiceImpl implements CoustomerService {
    final CoustomerRepository coustomerRepository;
    final ModelMapper modelMapper;

    @Override
    public void addCustomer(Customer customer) {
        coustomerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void updateCustomer(Customer customer) {
        coustomerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomer(Customer customer) {
        coustomerRepository.deleteById(customer.getId());
    }

    @Override
    public Customer getCustomer(Integer id) {
        return modelMapper.map(coustomerRepository.findById(id), Customer.class);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        coustomerRepository.findAll().forEach(coustomer -> customers.add(modelMapper.map(coustomer, Customer.class)));
        return customers;
    }
}
