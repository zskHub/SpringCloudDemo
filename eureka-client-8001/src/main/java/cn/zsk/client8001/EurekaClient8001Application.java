package cn.zsk.client8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表示本服务将会注册进服务中
//@EnableDiscoveryClient //表示服务发现
public class EurekaClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8001Application.class, args);
    }

}
