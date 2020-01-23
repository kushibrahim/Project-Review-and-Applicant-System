package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.Project;

import java.util.List;

public interface IProjectService {

    List<Project> getAllProjects();
    void add(Project project);
    void update(Project project);
    void delete(int id);
    Project getById(int id);
}
