package pl.kodolamacz.dao;

import pl.kodolamacz.model.Employer;

import java.util.List;

/**
 * Created by Jag on 2017-07-04.
 */

public interface EmployerDao {

    void addEmployer(Employer employer);

    Employer findEmployer(int id);

    Employer findEmployer(String name);

    List<Employer> findAll();

}
