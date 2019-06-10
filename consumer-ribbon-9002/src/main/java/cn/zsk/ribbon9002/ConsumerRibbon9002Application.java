package cn.zsk.ribbon9002;

import cn.zsk.ribbon.myrule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，从而使配置生效
@RibbonClient(name = "EUREKA-CLIENT-8001",configuration = MyRuleConfig.class)
public class ConsumerRibbon9002Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbon9002Application.class, args);
    }

}
