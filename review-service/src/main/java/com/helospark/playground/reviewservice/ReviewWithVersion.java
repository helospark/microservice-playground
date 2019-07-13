package com.helospark.playground.reviewservice;

import java.util.Collections;

import javax.annotation.Generated;

public class ReviewWithVersion {
    private String version;
    private Iterable<Review> reviews;

    @Generated("SparkTools")
    private ReviewWithVersion(Builder builder) {
        this.version = builder.version;
        this.reviews = builder.reviews;
    }

    public String getVersion() {
        return version;
    }

    public Iterable<Review> getReviews() {
        return reviews;
    }

    @Generated("SparkTools")
    public static Builder builder() {
        return new Builder();
    }

    @Generated("SparkTools")
    public static final class Builder {
        private String version;
        private Iterable<Review> reviews = Collections.emptyList();

        private Builder() {
        }

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withReviews(Iterable<Review> reviews) {
            this.reviews = reviews;
            return this;
        }

        public ReviewWithVersion build() {
            return new ReviewWithVersion(this);
        }
    }

}
