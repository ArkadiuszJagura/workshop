package pl.kodolamacz.dao;

import pl.kodolamacz.model.Customer;

import java.util.List;

/**
 * Created by Jag on 2017-07-04.
 */

public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer findCustomer(int id);

    Customer findCustomer(String name);

    List<Customer> findAll();

}
