package cn.zsk.consume9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.zsk.api.service"})
/*
 * @SpringBootApplication注解只会扫描所在包以及子包，而这个东西在common-api模块，虽然通过jar包引进来了，
 * 但是需要去扫描才能将带有@Component装填进来。同时注意，添加@ComponentScan后，原有的@SpringBootApplication注解带来
 * 的扫描效果就会消失，所以将本模块的也重新扫描一下
 *
 * */
@ComponentScan(basePackages = {"cn.zsk.api.service","cn.zsk"})
public class ConsumerFeignHystrix9004Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrix9004Application.class, args);
    }

}
