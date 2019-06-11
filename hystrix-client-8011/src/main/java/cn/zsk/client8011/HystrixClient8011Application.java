package cn.zsk.client8011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableCircuitBreaker
public class HystrixClient8011Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixClient8011Application.class, args);
    }

}
