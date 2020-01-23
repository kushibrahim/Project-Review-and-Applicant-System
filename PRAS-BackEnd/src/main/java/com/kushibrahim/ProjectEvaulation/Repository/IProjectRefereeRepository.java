package com.kushibrahim.ProjectEvaulation.Repository;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectReferee;

import java.util.List;

public interface IProjectRefereeRepository {

    List<ProjectReferee> getAllReferees();
    void add(ProjectReferee referee);
    void update(ProjectReferee referee);
    void delete(ProjectReferee referee);
    ProjectReferee getById(int id);
}
