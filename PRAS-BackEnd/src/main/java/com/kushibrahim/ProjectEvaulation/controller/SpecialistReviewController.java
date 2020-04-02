package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.entities.SpecialistReview;
import com.kushibrahim.ProjectEvaulation.service.ISpecialistReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialistReview")
@CrossOrigin(origins = "http://localhost:3000")
public class SpecialistReviewController {

    private ISpecialistReviewService specialistReviewService;

    @Autowired
    public SpecialistReviewController(ISpecialistReviewService specialistReviewService) {
        this.specialistReviewService = specialistReviewService;
    }

    @GetMapping("/reviews")
    public List<SpecialistReview> getAllReviews() {
        return specialistReviewService.getAllReviews();
    }

    @PostMapping("/Add")
    public void add(@RequestBody SpecialistReview specialistReview) {
        specialistReviewService.add(specialistReview);
    }

    @PostMapping("/Update")
    public void update(@RequestBody SpecialistReview specialistReview) {
        specialistReviewService.add(specialistReview);
    }

    @DeleteMapping("/Delete")
    public void delete(@RequestBody SpecialistReview specialistReview) {
        specialistReviewService.delete(specialistReview);
    }

    @GetMapping("/review/{id}")
    public SpecialistReview getReviewById(@PathVariable int id) {
        return specialistReviewService.getReviewById(id);
    }
}
