package com.bounce.springexample.mybatis;

import com.bounce.springexample.mybatis.domain.Review;
import com.bounce.springexample.mybatis.repository.ReviewRepository;
import com.bounce.springexample.mybatis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ReviewRepository reviewRepository;

    // id가 3인 리뷰 정보를 response에 담기
    @RequestMapping("/mybatis/review")
    @ResponseBody
    public Review review(@RequestParam int id) {
        // request


        // id가 3인 리뷰정보 얻어오기
        Review review = reviewRepository.selectReview(13);
        return review;
    }
}
