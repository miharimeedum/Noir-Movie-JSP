package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Customer;

import java.util.List;

public interface CoustomerService {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getCustomer(Integer id);
    List<Customer> getAllCustomers();

}
