package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;

import java.util.List;

public interface IProjectRefereeRepository {

    List<ProjectReferee> getAllReferees();
    void add(ProjectReferee referee);
    void update(ProjectReferee referee);
    void delete(ProjectReferee referee);
    ProjectReferee getById(int id);
}
