package jeeno.example.demo;

import jeeno.example.demo.pojo.UserDO;
import jeeno.example.demo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEhcacheApplicationTests {

    @Autowired
    private UserService service;

    @Autowired
    private CacheManager cacheManager;


    @Before
    public void before() {
        service.save(new UserDO("Jeeno", 18));
    }

    @Test
    public void test() {

        System.out.println("current cacheManager: " + cacheManager.toString());

        UserDO user = service.findByName("Jeeno");
        System.out.println("the first time：" + user.getAge());

        // the save function will refresh the cache
//        user.setAge(20);
//        service.save(user);

        // it would not actually run the sql command at 2nd time, just turn back from the cache.
        UserDO user2 = service.findByName("Jeeno");
        System.out.println("the second time：" + user2.getAge());
    }

}
