package com.kushibrahim.ProjectEvaulation.Repository;

import com.kushibrahim.ProjectEvaulation.Entities.Project;
import com.kushibrahim.ProjectEvaulation.Entities.ProjectApplicant;
import com.kushibrahim.ProjectEvaulation.Entities.SpecialistReview;

import java.util.List;

public interface IProjectRepository {

    List<Project> getAllProjects();
    void add(Project project);
    void update(Project project);
    void delete(int id);
    Project getById(int id);

}
