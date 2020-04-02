package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.Project;

import java.util.List;

public interface IProjectService {

    List<Project> getAllProjects();
    void add(Project project);
    void update(Project project);
    void delete(int id);
    Project getById(int id);
}
