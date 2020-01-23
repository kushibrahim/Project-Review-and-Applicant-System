package com.kushibrahim.ProjectEvaulation.restApi;

import com.kushibrahim.ProjectEvaulation.Entities.*;
import com.kushibrahim.ProjectEvaulation.Service.IProjectApplicantService;
import com.kushibrahim.ProjectEvaulation.Service.IProjectService;
import com.kushibrahim.ProjectEvaulation.Service.ISpecialistReviewService;
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
    public ProjectController(IProjectService projectService,
                             IProjectApplicantService projectApplicantService,
                             ISpecialistReviewService specialistReviewService) {
        this.projectService = projectService;
        this.projectApplicantService = projectApplicantService;
        this.specialistReviewService = specialistReviewService;
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
