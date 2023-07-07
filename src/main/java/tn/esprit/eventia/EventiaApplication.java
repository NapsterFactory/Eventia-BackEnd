package tn.esprit.eventia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
//@ComponentScan(basePackages = {"","tn.esprit.eventia.SpringSecurity"})
public class EventiaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventiaApplication.class, args);
    }

}
