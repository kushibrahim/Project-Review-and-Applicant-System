package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectSpecialist;

import java.util.List;

public interface IProjectSpecialistService {

    List<ProjectSpecialist> getAllSpecialists();
    void add(ProjectSpecialist specialist);
    void update(ProjectSpecialist specialist);
    void delete(ProjectSpecialist specialist);
    ProjectSpecialist getById(int id);
}
