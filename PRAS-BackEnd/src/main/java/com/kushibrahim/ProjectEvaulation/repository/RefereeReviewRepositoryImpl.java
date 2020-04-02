package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.RefereeReview;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RefereeReviewRepositoryImpl implements IRefereeReviewRepository {

    private EntityManager entityManager;

    @Autowired
    public RefereeReviewRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<RefereeReview> getAllReviews() {
        Session session = entityManager.unwrap(Session.class);
        List<RefereeReview> refereeReviews = session.createQuery("from RefereeReview" , RefereeReview.class).getResultList();
        return refereeReviews;
    }

    @Override
    public void add(RefereeReview refereeReview) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(refereeReview);
    }

    @Override
    public void update(RefereeReview refereeReview) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(refereeReview);
    }

    @Override
    public void delete(RefereeReview refereeReview) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(refereeReview);
    }

    @Override
    public RefereeReview getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        RefereeReview refereeReview = session.get(RefereeReview.class,id);
        return refereeReview;
    }
}
