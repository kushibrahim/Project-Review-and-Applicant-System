package com.kushibrahim.ProjectEvaulation.Repository;

import com.kushibrahim.ProjectEvaulation.Entities.Project;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    private EntityManager entityManager;

    @Autowired
    public ProjectRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Project> getAllProjects() {
        Session session = entityManager.unwrap(Session.class);
        List<Project> projects = session.createQuery("from Project" ,Project.class).getResultList();
        return projects;
    }

    @Override
    public void add(Project project) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(project);
    }

    @Override
    public void update(Project project) {
        Session session = entityManager.unwrap(Session.class);
        session.update(project);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Project project = session.get(Project.class,id);
        session.delete(id);
    }

    @Override
    public Project getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Project projects = session.get(Project.class,id);
        return projects;
    }
}
