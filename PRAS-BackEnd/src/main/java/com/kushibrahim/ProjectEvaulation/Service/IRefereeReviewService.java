package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.RefereeReview;

import java.util.List;

public interface IRefereeReviewService {

    List<RefereeReview> getAllReviews();
    void add(RefereeReview refereeReview);
    void update(RefereeReview refereeReview);
    void delete(RefereeReview refereeReview);
    RefereeReview getById(int id);
}
