package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;

import java.util.List;

public interface ISpecialistReviewService {

    List<SpecialistReview> getAllReviews();
    void add(SpecialistReview specialistReview);
    void update(SpecialistReview specialistReview);
    void delete(SpecialistReview specialistReview);
    SpecialistReview getReviewById(int id);
}
