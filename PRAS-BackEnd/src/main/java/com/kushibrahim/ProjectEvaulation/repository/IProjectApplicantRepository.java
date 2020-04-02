package com.kushibrahim.ProjectEvaulation.repository;

import com.kushibrahim.ProjectEvaulation.entities.ProjectApplicant;

import java.util.List;

public interface IProjectApplicantRepository {

    List<ProjectApplicant> getAll();
    void add(ProjectApplicant user);
    void update(ProjectApplicant user);
    void delete(ProjectApplicant user);
    ProjectApplicant getById(int id);
}
