package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.RefereeReview;
import com.kushibrahim.ProjectEvaulation.Repository.IRefereeReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RefereeReviewServiceImpl implements IRefereeReviewService {

    private IRefereeReviewRepository refereeReviewRepository;

    @Autowired
    public RefereeReviewServiceImpl(IRefereeReviewRepository refereeReviewRepository) {
        this.refereeReviewRepository = refereeReviewRepository;
    }

    @Override
    @Transactional
    public List<RefereeReview> getAllReviews() {
        return refereeReviewRepository.getAllReviews();
    }

    @Override
    @Transactional
    public void add(RefereeReview refereeReview) {
        refereeReviewRepository.add(refereeReview);
    }

    @Override
    @Transactional
    public void update(RefereeReview refereeReview) {
        refereeReviewRepository.update(refereeReview);
    }

    @Override
    @Transactional
    public void delete(RefereeReview refereeReview) {
        refereeReviewRepository.delete(refereeReview);
    }

    @Override
    @Transactional
    public RefereeReview getById(int id) {
        return refereeReviewRepository.getById(id);
    }
}
