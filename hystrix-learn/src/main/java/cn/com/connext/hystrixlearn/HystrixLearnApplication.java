package cn.com.connext.hystrixlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixLearnApplication.class, args);
    }

}

