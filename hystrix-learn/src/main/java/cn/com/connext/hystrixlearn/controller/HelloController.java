package cn.com.connext.hystrixlearn.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds",value = "10000")
    },threadPoolProperties = {
            @HystrixProperty(name="coreSize",value = "1"),
            @HystrixProperty(name="maxQueueSize",value = "10")
    })
    @RequestMapping("/hello")
    public String hystrixHello(){
        return "Hystrix Hello";
    }

    public String fallback(){
        return "fallback";
    }
}
