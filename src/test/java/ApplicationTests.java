import org.junit.After;
import org.junit.Before;

//@RunWith(SpringRunner.class)
public class ApplicationTests {
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

}
