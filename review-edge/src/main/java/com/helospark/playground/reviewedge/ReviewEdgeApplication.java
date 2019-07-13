package com.helospark.playground.reviewedge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReviewEdgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewEdgeApplication.class, args);
    }

}
