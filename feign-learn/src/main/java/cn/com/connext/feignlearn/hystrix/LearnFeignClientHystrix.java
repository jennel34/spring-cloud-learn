package cn.com.connext.feignlearn.hystrix;

import cn.com.connext.feignlearn.feign.LearnFeignClient;
import org.springframework.stereotype.Component;

@Component
public class LearnFeignClientHystrix implements LearnFeignClient {
    @Override
    public String feignHello() {
        return "override feignHello fallback";
    }

    @Override
    public String feignHystrix() {
        return "override feignHystrix fallback";
    }
}
