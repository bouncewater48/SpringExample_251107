package com.bounce.springexample.mybatis.service;

import com.bounce.springexample.mybatis.domain.Review;
import com.bounce.springexample.mybatis.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // id 가 3인 리뷰 정보 얻어오기
    public Review getReview( int id) {

        Review review = reviewRepository.selectReview(id);

        return review;
    }
}
