package pl.kodolamacz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.dao.CustomerDao;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}
