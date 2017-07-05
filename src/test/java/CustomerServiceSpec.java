import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.service.CustomerService;

/**
 * Created by Jag on 2017-07-05.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CustomerServiceSpec extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void shouldAddCustomer() throws Exception {
        //given
        String customerName = "Nowak";
        int count1 = jdbcTemplate.queryForObject("SELECT count(*) FROM customer WHERE name like ?", Integer.class, customerName);

        //when
        customerService.addCustomer(customerName);

        //then


    }


}
