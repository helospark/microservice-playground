package com.helospark.playground.reviewedge;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "asd", url = "${review-service-url}")
public interface ReviewServiceClient {

    @GetMapping("/reviews/all")
    public ReviewWithVersion getAllReviews();

}
