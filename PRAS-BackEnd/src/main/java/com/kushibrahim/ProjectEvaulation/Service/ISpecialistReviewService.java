package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.SpecialistReview;

import java.util.List;

public interface ISpecialistReviewService {

    List<SpecialistReview> getAllReviews();
    void add(SpecialistReview specialistReview);
    void update(SpecialistReview specialistReview);
    void delete(SpecialistReview specialistReview);
    SpecialistReview getReviewById(int id);
}
