package cn.zsk.hystrix8012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class HystrixClient8012Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixClient8012Application.class, args);
    }

}
