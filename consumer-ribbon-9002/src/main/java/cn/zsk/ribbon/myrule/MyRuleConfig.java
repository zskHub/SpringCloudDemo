package cn.zsk.ribbon.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:zsk
 * @CreateTime:2019-06-10 14:26
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule(){
        return new MyRule();
    }
}
