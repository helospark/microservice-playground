package com.helospark.playground.reviewedge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewEdgeController {
    @Autowired
    private ReviewServiceClient reviewServiceClient;

    @GetMapping(path = "/allReviews")
    public ReviewWithVersion getAllReviews() {
        return reviewServiceClient.getAllReviews();
    }
}
