package com.kushibrahim.ProjectEvaulation.Repository;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectApplicant;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProjectApplicantRepositoryImpl implements IProjectApplicantRepository {
    private EntityManager entityManager;

    @Autowired
    public ProjectApplicantRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<ProjectApplicant> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<ProjectApplicant> users = session.createQuery("from ProjectApplicant",ProjectApplicant.class).getResultList();
        return users;
    }

    @Override
    public void add(ProjectApplicant user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void update(ProjectApplicant user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void delete(ProjectApplicant user) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(user);
    }

    @Override
    public ProjectApplicant getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        ProjectApplicant projectApplicant = session.get(ProjectApplicant.class,id);
        return projectApplicant;
    }
}
