package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;

import java.util.List;

public interface IProjectRefereeService {

    List<ProjectReferee> getAllReferees();
    void add(ProjectReferee referee);
    void update(ProjectReferee referee);
    void delete(ProjectReferee referee);
    ProjectReferee getById(int id);
}
