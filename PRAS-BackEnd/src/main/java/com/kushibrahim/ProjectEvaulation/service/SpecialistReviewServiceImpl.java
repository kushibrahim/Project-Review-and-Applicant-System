package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;
import com.kushibrahim.ProjectEvaulation.repository.ISpecialistReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SpecialistReviewServiceImpl implements ISpecialistReviewService {

    private ISpecialistReviewRepository specialistReviewRepository;

    @Autowired
    public SpecialistReviewServiceImpl(ISpecialistReviewRepository specialistReviewRepository) {
        this.specialistReviewRepository = specialistReviewRepository;
    }

    @Override
    @Transactional
    public List<SpecialistReview> getAllReviews() {
        return specialistReviewRepository.getAllReviews();
    }

    @Override
    @Transactional
    public void add(SpecialistReview specialistReview) {
        specialistReviewRepository.add(specialistReview);
    }

    @Override
    @Transactional
    public void update(SpecialistReview specialistReview) {
        specialistReviewRepository.add(specialistReview);
    }

    @Override
    @Transactional
    public void delete(SpecialistReview specialistReview) {
        specialistReviewRepository.delete(specialistReview);
    }

    @Override
    @Transactional
    public SpecialistReview getReviewById(int id) {
        return specialistReviewRepository.getReviewById(id);
    }
}
