import com.tb.configuration.TBConfiguration;
import com.tb.model.Sales;
import com.tb.service.SalesService;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by okancetin on 30/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TBConfiguration.class})
@WebAppConfiguration
public class TestSalesService {

    private MockMvc mockMvc;

    @Autowired
    private SalesService salesServiceMock;

    @Test
    public void testFindBySize(){

        //TODO Complete these unit test method!!!
        //assertThat(salesServiceMock.findBySize(1), Is.<List<Sales>>==null);
    }
}
