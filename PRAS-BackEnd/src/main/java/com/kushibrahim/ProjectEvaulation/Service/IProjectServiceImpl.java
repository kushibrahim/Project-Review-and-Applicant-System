package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.Project;
import com.kushibrahim.ProjectEvaulation.Repository.IProjectApplicantRepository;
import com.kushibrahim.ProjectEvaulation.Repository.IProjectRepository;
import com.kushibrahim.ProjectEvaulation.Repository.ISpecialistReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;
    private ISpecialistReviewRepository specialistReviewRepository;
    private IProjectApplicantRepository projectApplicantRepository;

    @Autowired
    public IProjectServiceImpl(IProjectRepository projectRepository,
                               ISpecialistReviewRepository specialistReviewRepository,
                               IProjectApplicantRepository projectApplicantRepository) {
        this.projectRepository = projectRepository;
        this.specialistReviewRepository = specialistReviewRepository;
        this.projectApplicantRepository = projectApplicantRepository;
    }

    @Override
    @Transactional
    public List<Project> getAllProjects() {
        return projectRepository.getAllProjects();
    }

    @Override
    @Transactional
    public void add(Project project) {
        projectRepository.add(project);
    }

    @Override
    @Transactional
    public void update(Project project) {
        projectRepository.update(project);
    }

    @Override
    @Transactional
    public void delete(int id) {
        projectRepository.delete(id);
    }


    @Override
    @Transactional
    public Project getById(int id) {
        return projectRepository.getById(id);
    }
}
