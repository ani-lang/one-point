package com.onepoint.onepoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
public class OnepointApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnepointApplication.class, args);
    }

}
