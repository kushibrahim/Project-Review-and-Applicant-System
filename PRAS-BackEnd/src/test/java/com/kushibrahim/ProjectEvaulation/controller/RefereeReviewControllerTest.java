package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.RefereeReview;
import com.kushibrahim.ProjectEvaulation.service.RefereeReviewServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = RefereeReviewController.class)
public class RefereeReviewControllerTest extends BaseControllerTest {

    private static final int REFEREE_REVIEW_ID = 1;
    private List<RefereeReview> refereeReviews;
    private RefereeReview refereeReview;

    @MockBean
    private RefereeReviewServiceImpl refereeReviewService;

    @Test
    public void whenGetAllRefereeReview_thenReturnRefereeReviewListSuccess() throws Exception {
        when(refereeReviewService.getAllReviews()).thenReturn(refereeReviews);
        mockMvc.perform(get("/refereeReview/reviews"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(refereeReviewService, times(1)).getAllReviews();
        verifyNoMoreInteractions(refereeReviewService);
    }

    @Test
    public void whenGetByIdRefereeReview_thenReturnRefereeReviewSuccess() throws Exception {
        when(refereeReviewService.getById(REFEREE_REVIEW_ID)).thenReturn(refereeReview);
        mockMvc.perform(get("/refereeReview/review/{id}", REFEREE_REVIEW_ID))
                .andDo(print())
                .andExpect(status().isOk());

        verify(refereeReviewService, times(1)).getById(REFEREE_REVIEW_ID);
        verifyNoMoreInteractions(refereeReviewService);
    }
}
