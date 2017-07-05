import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.kodolamacz.model.Employer;
import pl.kodolamacz.service.EmployerService;

import org.junit.Test;

import java.util.List;

/**
 * Created by Jag on 2017-07-04.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployerServiceSpec extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private EmployerService employerService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void shouldAddNewEmployer() throws Exception {
        //given
        String employerName = "Jan";
        int count1 = jdbcTemplate.queryForObject("SELECT count(*) from employer where name like ?", Integer.class, employerName);

        //when
        employerService.addEmployer(employerName);

    }




    @Test
    public void shouldReturnAllEmployers() throws Exception {
        // given
        jdbcTemplate.execute("TRUNCATE employer");

        Employer employer = new Employer();
        List<String>

        // when

        // then
    }


    @Test
    public void shouldReturnAllEmployers() throws Exception {
        // given
        // TODO

        // when
        List<Employers> employers = employerService.findAll();

        // then
        assertThat(employers).isNotEmpty();
        assertThat(Employers.size()).isEqualTo(2);

    }

    @Test
    public void shouldFindEmployerById() throws Exception {

    }

    @Test
    public void shouldEditEmployer() throws Exception {

    }


        // given

        // when

        // then


}
