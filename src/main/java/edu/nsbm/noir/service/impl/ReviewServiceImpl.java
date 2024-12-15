package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.ReviewEntity;
import edu.nsbm.noir.model.Review;
import edu.nsbm.noir.repository.ReviewRepository;
import edu.nsbm.noir.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addReview(Review review) {
        reviewRepository.save(modelMapper.map(review, ReviewEntity.class));
    }

    @Override
    public void deleteReview(Review review) {
        reviewRepository.deleteById(review.getId());
    }

    @Override
    public void updateReview(Review review) {
        reviewRepository.save(modelMapper.map(review, ReviewEntity.class));
    }

    @Override
    public List<Review> getReviews() {
        List<Review> reviews = new ArrayList<>();
        reviewRepository.findAll().forEach(reviewEntity -> reviews.add(modelMapper.map(reviewEntity, Review.class)));
        return reviews;
    }
}
