package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SpecialistReviewRepositoryImpl implements ISpecialistReviewRepository  {

    private EntityManager entityManager;

    @Autowired
    public SpecialistReviewRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<SpecialistReview> getAllReviews() {
        Session session = entityManager.unwrap(Session.class);
        List<SpecialistReview> specialistReviews = session.createQuery("from SpecialistReview", SpecialistReview.class).getResultList();
        return specialistReviews;
    }

    @Override
    public void add(SpecialistReview specialistReview) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(specialistReview);
    }

    @Override
    public void update(SpecialistReview specialistReview) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(specialistReview);
    }

    @Override
    public void delete(SpecialistReview specialistReview) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(specialistReview);
    }

    @Override
    public SpecialistReview getReviewById(int id) {
        Session session = entityManager.unwrap(Session.class);
        SpecialistReview specialistReview = session.get(SpecialistReview.class,id);
        return specialistReview;
    }
}
