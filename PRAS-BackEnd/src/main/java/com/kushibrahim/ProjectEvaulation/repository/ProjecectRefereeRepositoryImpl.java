package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProjecectRefereeRepositoryImpl implements IProjectRefereeRepository {

    private EntityManager entityManager;

    @Autowired
    public ProjecectRefereeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<ProjectReferee> getAllReferees() {
        Session session = entityManager.unwrap(Session.class);
        List<ProjectReferee> referees = session.createQuery("from ProjectReferee" ,ProjectReferee.class).getResultList();
        return referees;
    }

    @Override
    public void add(ProjectReferee referee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(referee);
    }

    @Override
    public void update(ProjectReferee referee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(referee);
    }

    @Override
    public void delete(ProjectReferee referee) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(referee);
    }

    @Override
    public ProjectReferee getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        ProjectReferee referee = session.get(ProjectReferee.class,id);
        return referee;
    }
}
