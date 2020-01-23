package com.kushibrahim.ProjectEvaulation.Service;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectSpecialist;
import com.kushibrahim.ProjectEvaulation.Repository.IProjectSpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectSpecialistServiceImpl implements IProjectSpecialistService {

    private IProjectSpecialistRepository specialistRepository;

    @Autowired
    public ProjectSpecialistServiceImpl(IProjectSpecialistRepository specialistRepository) {
        this.specialistRepository = specialistRepository;
    }

    @Override
    @Transactional
    public List<ProjectSpecialist> getAllSpecialists() {
        return specialistRepository.getAllSpecialists();
    }

    @Override
    @Transactional
    public void add(ProjectSpecialist specialist) {
        specialistRepository.add(specialist);
    }

    @Override
    @Transactional
    public void update(ProjectSpecialist specialist) {
        specialistRepository.update(specialist);
    }

    @Override
    @Transactional
    public void delete(ProjectSpecialist specialist) {
        specialistRepository.delete(specialist);
    }

    @Override
    @Transactional
    public ProjectSpecialist getById(int id) {
        return specialistRepository.getById(id);
    }
}
