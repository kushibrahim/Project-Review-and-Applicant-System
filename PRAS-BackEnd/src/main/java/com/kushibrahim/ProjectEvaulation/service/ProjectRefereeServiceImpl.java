package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;
import com.kushibrahim.ProjectEvaulation.repository.IProjectRefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectRefereeServiceImpl implements IProjectRefereeService {

    private IProjectRefereeRepository projectReferee;

    @Autowired
    public ProjectRefereeServiceImpl(IProjectRefereeRepository projectReferee) {
        this.projectReferee = projectReferee;
    }

    @Override
    @Transactional
    public List<ProjectReferee> getAllReferees() {
        return projectReferee.getAllReferees();
    }

    @Override
    @Transactional
    public void add(ProjectReferee referee) {
        projectReferee.add(referee);
    }

    @Override
    @Transactional
    public void update(ProjectReferee referee) {
        projectReferee.update(referee);
    }

    @Override
    @Transactional
    public void delete(ProjectReferee referee) {
        projectReferee.delete(referee);
    }

    @Override
    @Transactional
    public ProjectReferee getById(int id) {
        return projectReferee.getById(id);
    }
}
