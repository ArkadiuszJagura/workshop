package pl.kodolamacz.service;

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
