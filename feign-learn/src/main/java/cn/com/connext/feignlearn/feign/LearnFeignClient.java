package cn.com.connext.feignlearn.feign;

import cn.com.connext.feignlearn.hystrix.LearnFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-learn-client" ,  fallback = LearnFeignClientHystrix.class)
public interface LearnFeignClient {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String feignHello();

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String feignHystrix();
}
