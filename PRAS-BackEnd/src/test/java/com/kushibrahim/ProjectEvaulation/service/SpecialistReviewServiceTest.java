package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;
import com.kushibrahim.ProjectEvaulation.repository.ISpecialistReviewRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class SpecialistReviewServiceTest {


    private static final int SPECIALIST_REVIEW = 1;
    private static final Date SPECIALIST_REVIEW_DATETIME = new Date("2020/04/01");
    private static final String SPECIALIST_REVIEW_DECISION = "Specialist review is positive.";
    private static final String SPECIALIST_REVIEW_SUMMARY = "Specialist Review Summary";
    @InjectMocks
    private SpecialistReviewServiceImpl specialistReviewService;

    @Mock
    private ISpecialistReviewRepository specialistReviewRepository;

    @Test
    public void whenGetAllReviewsSpecialistReview_thenReturnSpecialistReviewList(){
        SpecialistReview specialistReview = new SpecialistReview();
        specialistReview.setSpecialistReviewID(SPECIALIST_REVIEW);
        specialistReview.setSpecialistReviewDateTime(SPECIALIST_REVIEW_DATETIME);
        specialistReview.setSpecialistReviewDecision(SPECIALIST_REVIEW_DECISION);
        specialistReview.setSpecialistReviewSummary(SPECIALIST_REVIEW_SUMMARY);

        when(specialistReviewRepository.getAllReviews()).thenReturn(Collections.singletonList(specialistReview));
        List<SpecialistReview> specialistReviews = specialistReviewService.getAllReviews();
        SpecialistReview response = specialistReviews.get(0);

        assertEquals(SPECIALIST_REVIEW, response.getSpecialistReviewID());
        assertEquals(SPECIALIST_REVIEW_DATETIME, response.getSpecialistReviewDateTime());
        assertEquals(SPECIALIST_REVIEW_DECISION, response.getSpecialistReviewDecision());
        assertEquals(SPECIALIST_REVIEW_SUMMARY, response.getSpecialistReviewSummary());
    }
}
