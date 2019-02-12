package cn.com.connext.feignlearn.controller;

import cn.com.connext.feignlearn.feign.LearnFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private LearnFeignClient learnFeignClient;

    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

//    @HystrixCommand(fallbackMethod = "helloFallback")
    @GetMapping("/feignHello")
    public String Hello(){
        log.info("调用方法feignHello()");
        return learnFeignClient.feignHello();
    }

    /*public String helloFallback(){
        return "fallback";
    }*/

    @GetMapping("/feignHystrix")
    public String feignHystrix(){
        log.info("调用方法feignHystrix()");
        return learnFeignClient.feignHystrix();
    }
}
