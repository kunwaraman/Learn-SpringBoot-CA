package org.springcoreDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springcoreDemo")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Aman",25);
    }


}
