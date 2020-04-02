package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.RefereeReview;
import com.kushibrahim.ProjectEvaulation.repository.IRefereeReviewRepository;
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
public class RefereeReviewServiceTest {
    
    private static final int REFEREE_REVIEW_ID = 1;
    private static final Date REFEREE_REVIEW_DATETIME = new Date("2020/04/01");
    private static final String REFEREE_REVIEW_DECISION = "ACCEPT";
    private static final String REFEREE_REVIEW_SUMMARY = "Referee reviews are positive.";

    @InjectMocks
    private RefereeReviewServiceImpl refereeReviewService;

    @Mock
    private IRefereeReviewRepository refereeReviewRepository;

    @Test
    public void whenGetAllReviewsRefereeReviews_thenReturnRefereeReviewList(){
        RefereeReview refereeReview = new RefereeReview();
        refereeReview.setRefereeReviewID(REFEREE_REVIEW_ID);
        refereeReview.setRefereeReviewDateTime(REFEREE_REVIEW_DATETIME);
        refereeReview.setRefereeReviewDecision(REFEREE_REVIEW_DECISION);
        refereeReview.setRefereeReviewSummary(REFEREE_REVIEW_SUMMARY);

        when(refereeReviewRepository.getAllReviews()).thenReturn(Collections.singletonList(refereeReview));
        List<RefereeReview> refereeReviews = refereeReviewService.getAllReviews();
        RefereeReview response = refereeReviews.get(0);

        assertEquals(REFEREE_REVIEW_ID, response.getRefereeReviewID());
        assertEquals(REFEREE_REVIEW_DATETIME, response.getRefereeReviewDateTime());
        assertEquals(REFEREE_REVIEW_DECISION, response.getRefereeReviewDecision());
        assertEquals(REFEREE_REVIEW_SUMMARY, response.getRefereeReviewSummary());
    }

    @Test
    public void whenGetByIdRefereeReview_thenReturnRefereeReview(){
        RefereeReview refereeReview = new RefereeReview();
        refereeReview.setRefereeReviewID(REFEREE_REVIEW_ID);
        refereeReview.setRefereeReviewDateTime(REFEREE_REVIEW_DATETIME);
        refereeReview.setRefereeReviewDecision(REFEREE_REVIEW_DECISION);
        refereeReview.setRefereeReviewSummary(REFEREE_REVIEW_SUMMARY);

        when(refereeReviewRepository.getById(REFEREE_REVIEW_ID)).thenReturn(refereeReview);

        assertEquals(REFEREE_REVIEW_ID, refereeReview.getRefereeReviewID());
        assertEquals(REFEREE_REVIEW_DATETIME, refereeReview.getRefereeReviewDateTime());
        assertEquals(REFEREE_REVIEW_DECISION, refereeReview.getRefereeReviewDecision());
        assertEquals(REFEREE_REVIEW_SUMMARY, refereeReview.getRefereeReviewSummary());
    }
}
