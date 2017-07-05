package pl.kodolamacz.service;

import pl.kodolamacz.dao.*;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class OrderService {


    @Autowired
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    @Autowired
    private EmployerDao employerDao;

    public void setEmployerDao(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Autowired
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @Autowired
    private SparePartDao sparePartDao;

    public void setSparePartDao(SparePartDao sparePartDao) {
        this.sparePartDao = sparePartDao;
    }


    @Autowired
    private ServiceDao serviceDao;

    public void setServiceDao(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }


}
