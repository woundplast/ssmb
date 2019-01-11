import com.bb.dao.UserDao;
import com.bb.entity.User;
import com.bb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpSession;
import java.util.*;


@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserTest extends ApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void m1() {

        System.out.println("-+-" + userDao);
        List<User> users = userDao.queryAll();
        System.out.println("-++-" + users);
        List<User> userList = userService.queryAll();
        System.out.println("-+-+-" + userList);

        // 生成token
        String token = UUID.randomUUID().toString().substring(0, 16);
        String token1 = UUID.randomUUID().toString().substring(0, 15);
        String token2 = UUID.randomUUID().toString().substring(2, 6);
        String token3 = UUID.randomUUID().toString();
        System.out.println("//" + token);
        System.out.println("//" + token1);
        System.out.println("//" + token2);
        System.out.println("//" + token3);

    }

    @Test
    public void m2() {

        String str1 = null;
        String str2 = "";
        String str21 = " ";
        System.out.println("--++--" + (str1 == str2));
        System.out.println("--++--" + str2.equals(str1));
        System.out.println("---" + str2.equals(str21));

        System.out.println(str2.isEmpty());
        System.out.println(str21.isEmpty());

        String str3 = "1245";
        String str4 = "1245";
        System.out.println("--++--" + (str3 == str4));
        System.out.println("--++--" + str3.equals(str4));


        Object obj = new Object();


    }

    public static final String USERNAME = "GZL";
    public static final int AGE = 18;


    @Test
    public void m3() {
        Integer integer = new Integer(200);

        String str = "adadafyufgha";
        String[] fs = str.split("f");
        for (String f : fs) {
            System.out.println("--" + f);
        }
        Map map = new HashMap<String, HttpSession>();
        map.put("ada", "ada");
        //String str6 =  "(<[^>]*>)";
    }

    @Test
    public void m4() {
        String str1 = "Abc";
        String str2 = "abc";
        String str3 = "ab";
        boolean b1 = str1.equalsIgnoreCase(str2);
        boolean b2 = str1.equals(str2);
        boolean b3 = str2.contentEquals(str3);
        boolean b4 = str1.contentEquals(str2);

        System.out.println("----" + b1);


    }


    @Test
    public void m5() {
        Random random = new Random();
        int i2 = random.nextInt();


        int i = random.nextInt(6);
        int i1 = random.nextInt(3) % 5;//生成一个[0 ,n)之间的数字

        System.out.println(random);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);


    }
}
