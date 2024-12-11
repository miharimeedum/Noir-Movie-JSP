package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Review;

import java.util.List;

public interface ReviewService {
    void addReview(Review review);
    void deleteReview(Review review);
    void updateReview(Review review);
    List<Review> getReviews();
}
