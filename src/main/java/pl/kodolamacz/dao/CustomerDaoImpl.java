package pl.kodolamacz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.kodolamacz.model.Customer;

/**
 * Created by Jag on 2017-07-04.
 */
public class CustomerDaoImpl implements CustomerDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Customer



}
