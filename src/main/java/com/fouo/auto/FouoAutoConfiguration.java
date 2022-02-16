package com.fouo.auto;

import com.fouo.FouoService;
import com.fouo.config.HelloProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(FouoService.class)
@EnableConfigurationProperties(HelloProperties.class) //默认组件会放到容器中
public class FouoAutoConfiguration {

    @Bean
    public FouoService fouoService(){
        return new FouoService();
    }
}
