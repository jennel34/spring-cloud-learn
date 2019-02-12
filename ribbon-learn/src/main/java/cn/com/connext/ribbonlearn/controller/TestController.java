package cn.com.connext.ribbonlearn.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    @Qualifier(value = "restTemplate")
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/test")
    public String testRibbon(){
        return this.restTemplate.getForObject("http://eureka-learn-client/hello",String.class);
    }

    public String fallback(){
        return "ribbon fallback";
    }
}
