package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.RefereeReview;

import java.util.List;

public interface IRefereeReviewService {

    List<RefereeReview> getAllReviews();
    void add(RefereeReview refereeReview);
    void update(RefereeReview refereeReview);
    void delete(RefereeReview refereeReview);
    RefereeReview getById(int id);
}
