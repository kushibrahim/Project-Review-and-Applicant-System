package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.entities.*;
import com.kushibrahim.ProjectEvaulation.service.IProjectApplicantService;
import com.kushibrahim.ProjectEvaulation.service.IProjectService;
import com.kushibrahim.ProjectEvaulation.service.ISpecialistReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    private IProjectService projectService;
    private IProjectApplicantService projectApplicantService;
    private ISpecialistReviewService specialistReviewService;

    @Autowired
    public ProjectController(IProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping()
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping("/projectAdd")
    public void add(@RequestBody Project project) {
        projectService.add(project);
    }

    @PostMapping("/projectUpdate")
    public void update(@RequestBody Project project) {
        projectService.update(project);
    }

    @DeleteMapping("/projectDelete/{id}")
    public void delete(@RequestBody @PathVariable int id) {
        projectService.delete(id);
    }

    @GetMapping("/project/{id}")
    public Project getById(@PathVariable int id) {
        return projectService.getById(id);
    }
}
