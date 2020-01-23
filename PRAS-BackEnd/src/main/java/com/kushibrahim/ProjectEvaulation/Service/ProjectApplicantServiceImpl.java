package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectApplicant;
import com.kushibrahim.ProjectEvaulation.Repository.IProjectApplicantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectApplicantServiceImpl implements IProjectApplicantService {
    private IProjectApplicantRepository projectApplicantRepository;

    public ProjectApplicantServiceImpl(IProjectApplicantRepository projectApplicantRepository) {
        this.projectApplicantRepository = projectApplicantRepository;
    }

    @Override
    @Transactional
    public List<ProjectApplicant> getAll() {
        return projectApplicantRepository.getAll();
    }

    @Override
    @Transactional
    public void add(ProjectApplicant user) {
        projectApplicantRepository.add(user);

    }

    @Override
    @Transactional
    public void update(ProjectApplicant user) {
        projectApplicantRepository.update(user);
    }

    @Override
    @Transactional
    public void delete(ProjectApplicant user) {
        projectApplicantRepository.delete(user);
    }

    @Override
    @Transactional
    public ProjectApplicant getById(int id) {
        return projectApplicantRepository.getById(id);
    }
}
