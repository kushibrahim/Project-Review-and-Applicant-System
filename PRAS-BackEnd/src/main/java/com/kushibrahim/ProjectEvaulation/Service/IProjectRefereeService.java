package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectReferee;

import java.util.List;

public interface IProjectRefereeService {

    List<ProjectReferee> getAllReferees();
    void add(ProjectReferee referee);
    void update(ProjectReferee referee);
    void delete(ProjectReferee referee);
    ProjectReferee getById(int id);
}
