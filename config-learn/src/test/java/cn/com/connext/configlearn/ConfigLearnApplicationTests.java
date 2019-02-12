package cn.com.connext.configlearn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigLearnApplicationTests {

    @Test
    public void contextLoads() {
        for (int i = 0; i < 3; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }

}

