package com.kushibrahim.ProjectEvaulation.restApi;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectApplicant;
import com.kushibrahim.ProjectEvaulation.Service.IProjectApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectApplicantController {

    private IProjectApplicantService projectApplicantService;

    @Autowired
    public ProjectApplicantController(IProjectApplicantService projectApplicantService) {
        this.projectApplicantService = projectApplicantService;
    }

    @GetMapping()
    public List<ProjectApplicant> getAll() {
        return projectApplicantService.getAll();
    }

    @PostMapping("/userAdd")
    public void add(@RequestBody ProjectApplicant projectApplicant) {
        this.projectApplicantService.add(projectApplicant);
    }

    @PostMapping("/userUpdate")
    public void update(@RequestBody ProjectApplicant user) {
        this.projectApplicantService.update(user);
    }

    @DeleteMapping("/userDelete")
    public void delete(@RequestBody ProjectApplicant user) {
        this.projectApplicantService.delete(user);
    }

    @GetMapping("/user/{id}")
    public ProjectApplicant getById(@PathVariable int id) {
        return projectApplicantService.getById(id);
    }
}
