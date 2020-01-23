package com.kushibrahim.ProjectEvaulation.Repository;

import com.kushibrahim.ProjectEvaulation.Entities.RefereeReview;

import java.util.List;

public interface IRefereeReviewRepository {

    List<RefereeReview> getAllReviews();
    void add(RefereeReview refereeReview);
    void update(RefereeReview refereeReview);
    void delete(RefereeReview refereeReview);
    RefereeReview getById(int id);
}
