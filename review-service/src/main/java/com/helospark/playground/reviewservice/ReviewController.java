package com.helospark.playground.reviewservice;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;
    @Value("${project.version}")
    String version;

    @PostConstruct
    public void addTestData() {
        reviewRepository.save(createReview("ok"));
        reviewRepository.save(createReview("fine"));
        reviewRepository.save(createReview("bad"));
    }

    private Review createReview(String string) {
        Review review = new Review();
        review.setReview(string);
        return review;
    }

    @PostMapping(path = "/reviews")
    public void saveReview(@RequestBody ReviewRequest request) {
        Review review = new Review();
        review.setReview(request.getReview());
        reviewRepository.save(review);
    }

    @GetMapping(path = "/reviews/all")
    public ReviewWithVersion getAll() {
        return ReviewWithVersion.builder()
                .withVersion(version)
                .withReviews(reviewRepository.findAll())
                .build();
    }

    @GetMapping(path = "/reviews")
    public ReviewWithVersion getOne(@RequestParam("id") long id) {
        return ReviewWithVersion.builder()
                .withVersion(version)
                .withReviews(List.of(reviewRepository.findById(id).get()))
                .build();
    }
}
