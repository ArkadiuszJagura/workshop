package pl.kodolamacz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kodolamacz.dao.EmployerDao;
import pl.kodolamacz.model.Employer;

import java.util.List;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class EmployerService {

    @Autowired
    private EmployerDao employerDao;

    public void addEmployer(String name) {
        Employer employer = new Employer(0, name);
        employerDao.addEmployer(employer);
    }

    public Employer findEmployer(int id) {
        return employerDao.findEmployer(id);
    }

    public Employer findEmployer(String name) {
        return employerDao.findEmployer(name);
    }

    public List<Employer> findAllEmployers() {
        return employerDao.findAll();
    }

}
