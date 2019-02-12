package cn.com.connext.ribbonlearn;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class RibbonLearnApplication {

    @Bean(name = "restTemplate")
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonLearnApplication.class, args);
    }

}
