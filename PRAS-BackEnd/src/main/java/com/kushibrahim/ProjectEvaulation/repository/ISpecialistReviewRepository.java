package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;

import java.util.List;

public interface ISpecialistReviewRepository {

    List<SpecialistReview> getAllReviews();
    void add(SpecialistReview specialistReview);
    void update(SpecialistReview specialistReview);
    void delete(SpecialistReview specialistReview);
    SpecialistReview getReviewById(int id);
}
