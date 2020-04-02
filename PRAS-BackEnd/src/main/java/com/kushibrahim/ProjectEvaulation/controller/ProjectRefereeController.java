package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;
import com.kushibrahim.ProjectEvaulation.service.IProjectRefereeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/referees")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectRefereeController {

    private IProjectRefereeService projectRefereeService;

    @Autowired
    public ProjectRefereeController(IProjectRefereeService projectRefereeService) {
        this.projectRefereeService = projectRefereeService;
    }

    @GetMapping()
    public List<ProjectReferee> getAllReferees() {
        return projectRefereeService.getAllReferees();
    }

    @PostMapping("/addReferee")
    public void add(@Valid @RequestBody ProjectReferee referee) {
        projectRefereeService.add(referee);
    }

    @PostMapping("/updateReferee")
    public void update(@Valid @RequestBody ProjectReferee referee) {
        projectRefereeService.update(referee);
    }

    @DeleteMapping("/deleteReferee")
    public void delete(@Valid @RequestBody ProjectReferee referee) {
        projectRefereeService.delete(referee);
    }

    @GetMapping("/referee/{id}")
    public ProjectReferee getById(@Valid @PathVariable int id) {
        return projectRefereeService.getById(id);
    }
}
