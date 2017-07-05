package pl.kodolamacz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.dao.EmployerDao;
import pl.kodolamacz.model.Employer;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class EmployerService {

    @Autowired
    private EmployerDao employerDao;

    public void setEmployerDao(EmployerDao employerDao) {
        Employer employer = new Employer(id, name);
    }

}
