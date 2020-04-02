package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.Project;

import java.util.List;

public interface IProjectRepository {

    List<Project> getAllProjects();
    void add(Project project);
    void update(Project project);
    void delete(int id);
    Project getById(int id);

}
