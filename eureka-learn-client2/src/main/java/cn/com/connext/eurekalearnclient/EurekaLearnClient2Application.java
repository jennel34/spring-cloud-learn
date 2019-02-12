package cn.com.connext.eurekalearnclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaLearnClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaLearnClient2Application.class, args);
        fun();
    }

    public static void fun(){
        String str = "EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.";
        System.out.println(str.toLowerCase());
        while (true){ }
    }

}

