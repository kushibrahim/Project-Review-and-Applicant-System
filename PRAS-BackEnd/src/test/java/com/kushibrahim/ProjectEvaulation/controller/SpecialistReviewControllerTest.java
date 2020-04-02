package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;
import com.kushibrahim.ProjectEvaulation.service.SpecialistReviewServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = SpecialistReviewController.class)
public class SpecialistReviewControllerTest extends BaseControllerTest {

    private static final int SPECIALIST_REVIEW_ID = 1;
    private List<SpecialistReview> specialistReviews;
    private SpecialistReview specialistReview;

    @MockBean
    private SpecialistReviewServiceImpl specialistReviewService;

    @Test
    public void whenGetAllSpecialistReview_thenReturnSpecialistReviewListSuccess() throws Exception {
        when(specialistReviewService.getAllReviews()).thenReturn(specialistReviews);
        mockMvc.perform(get("/specialistReview/reviews"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(specialistReviewService, times(1)).getAllReviews();
        verifyNoMoreInteractions(specialistReviewService);
    }

    @Test
    public void whenGetByIdSpecialistReview_thenReturnSpecialistReviewSuccess() throws Exception {
        when(specialistReviewService.getReviewById(SPECIALIST_REVIEW_ID)).thenReturn(specialistReview);
        mockMvc.perform(get("/specialistReview//review/{id}", SPECIALIST_REVIEW_ID))
                .andDo(print())
                .andExpect(status().isOk());

        verify(specialistReviewService, times(1)).getReviewById(SPECIALIST_REVIEW_ID);
        verifyNoMoreInteractions(specialistReviewService);
    }
}
