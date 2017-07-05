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

        return new Employer(id, name);
    };

    @Override
    public void addEmployer(Employer employer) {
        jdbcTemplate.update("INSERT INTO employer(name) VALUES (?)", employer.getName());
    }

    @Override
    public Employer findEmployer(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM employer WHERE id = ?", employerRowMapper, id);
    }

    @Override
    public Employer findEmployer(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM employer WHERE name LIKE ?", employerRowMapper, name);
    }

    @Override
    public List<Employer> findAll() {
        return jdbcTemplate.query("SELECT * FROM employer", employerRowMapper);
    }

}
