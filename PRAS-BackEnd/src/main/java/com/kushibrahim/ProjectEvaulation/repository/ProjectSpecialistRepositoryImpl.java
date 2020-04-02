package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.ProjectSpecialist;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProjectSpecialistRepositoryImpl implements IProjectSpecialistRepository {

    private EntityManager entityManager;

    @Autowired
    public ProjectSpecialistRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<ProjectSpecialist> getAllSpecialists() {
        Session session = entityManager.unwrap(Session.class);
        List<ProjectSpecialist> specialists = session.createQuery("from ProjectSpecialist" ,ProjectSpecialist.class).getResultList();
        return specialists;
    }

    @Override
    public void add(ProjectSpecialist specialist) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(specialist);
    }

    @Override
    public void update(ProjectSpecialist specialist) {
        Session session = entityManager.unwrap(Session.class);
        session.update(specialist);
    }

    @Override
    public void delete(ProjectSpecialist specialist) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(specialist);
    }

    @Override
    public ProjectSpecialist getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        ProjectSpecialist specialist = session.get(ProjectSpecialist.class,id);
        return specialist;
    }
}
