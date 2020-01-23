package com.kushibrahim.ProjectEvaulation.restApi;

import com.kushibrahim.ProjectEvaulation.Entities.ProjectSpecialist;
import com.kushibrahim.ProjectEvaulation.Service.IProjectSpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialists")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectSpecialistController {

    private IProjectSpecialistService projectSpecialistService;

    @Autowired
    public ProjectSpecialistController(IProjectSpecialistService projectSpecialistService) {
        this.projectSpecialistService = projectSpecialistService;
    }

    @GetMapping()
    public List<ProjectSpecialist> getAllSpecialists() {
        return projectSpecialistService.getAllSpecialists();
    }

    @PostMapping("/specialistAdd")
    public void add(@RequestBody ProjectSpecialist specialist) {
        projectSpecialistService.add(specialist);
    }

    @PostMapping("/specialistUpdate")
    public void update(@RequestBody ProjectSpecialist specialist) {
        projectSpecialistService.update(specialist);
    }

    @DeleteMapping("/specialistDelete")
    public void delete(@RequestBody ProjectSpecialist specialist) {
        projectSpecialistService.delete(specialist);
    }

    @GetMapping("/specialist/{id}")
    public ProjectSpecialist getById(@PathVariable int id) {
        return projectSpecialistService.getById(id);
    }
}
