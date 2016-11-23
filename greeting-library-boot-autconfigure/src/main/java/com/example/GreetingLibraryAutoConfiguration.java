package com.example;

import com.example.greeter.Greeter;
import com.example.greeter.GreeterBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreeterBuilder.class)
@EnableConfigurationProperties(GreeterConfigProperties.class)
public class GreetingLibraryAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(Greeter.class)
    public Greeter setup(GreeterConfigProperties properties) {

        return new GreeterBuilder().setMessage(properties.getMessage())
                .setName(properties.getName()).build();
    }
}
