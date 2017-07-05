package pl.kodolamacz.service;

import pl.kodolamacz.dao.ServiceDao;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    public void setServiceDao(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

}
