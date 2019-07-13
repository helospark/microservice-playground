package com.helospark.playground.reviewedge;

import java.util.List;

public class ReviewWithVersion {
    private String version;
    private List<Review> reviews;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

}
