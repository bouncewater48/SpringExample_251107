package com.bounce.springexample.mybatis;

import com.bounce.springexample.mybatis.domain.Review;
import com.bounce.springexample.mybatis.repository.ReviewRepository;
import com.bounce.springexample.mybatis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/mybatis/review")
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

    // 하나의 리뷰를 작성하는 기능
    @ResponseBody
    @RequestMapping("/write")
    public String writeReview() {
        // 4, 치즈피자, 강승훈, 4.5, 치즈피자 존맛!
        int count = reviewService.createReview(4,"치즈피자","강승훈", 4.5, "치즈피자 존맛!");

        // 2, 뿌링클, 강승훈, 4.0, 역시 뿌링클은 진리!!
//        Review review = new Review();
//        review.setStoreId(2);
//        review.setMenu("뿌링클");
//        review.setUserName("강승훈");
//        review.setPoint(4.0);
//        review.setReview("역시 뿌링클은 진리!!");

//        int count = reviewService.createReviewByObject(review);

        return "실행 결과 : " + count;

    }


}
