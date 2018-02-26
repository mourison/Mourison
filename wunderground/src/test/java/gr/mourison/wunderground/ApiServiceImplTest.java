package gr.mourison.wunderground;


import gr.mourison.wunderground.domain.Date;
import gr.mourison.wunderground.domain.ResponsePojo;
import gr.mourison.wunderground.services.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {


    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception{



    }

    @Test
    public void testGetResult() throws Exception{

        String date = apiService.getResponse("20171030").getHistory().getDate().getMon();
        assertEquals("10",date);

    }

}
