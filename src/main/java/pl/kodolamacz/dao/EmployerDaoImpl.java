package pl.kodolamacz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.kodolamacz.model.Employer;

import java.util.List;

/**
 * Created by Jag on 2017-07-05.
 */

@Repository
public class EmployerDaoImpl implements EmployerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Employer> employerRowMapper = (rs, rowNum) -> {

        int id = rs.getInt("id");
        String name = rs.getString("name");



    }

    @Override
    public void addEmployer(Employer employer) {

    }

    @Override
    public Employer findEmployer(int id) {
        return null;
    }

    @Override
    public Employer findEmployer(String name) {
        return null;
    }

    @Override
    public List<Employer> findAll() {
        return null;
    }
}
