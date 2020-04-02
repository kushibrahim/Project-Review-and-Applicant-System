package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.entities.RefereeReview;
import com.kushibrahim.ProjectEvaulation.service.IRefereeReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refereeReview")
@CrossOrigin(origins = "http://localhost:3000")
public class RefereeReviewController {

    private IRefereeReviewService refereeReviewService;

    @Autowired
    public RefereeReviewController(IRefereeReviewService refereeReviewService) {
        this.refereeReviewService = refereeReviewService;
    }

    @GetMapping("/reviews")
    public List<RefereeReview> getAllReviews() {
        return refereeReviewService.getAllReviews();
    }

    @PostMapping("/Add")
    public void add(@RequestBody RefereeReview refereeReview) {
        refereeReviewService.add(refereeReview);
    }

    @PostMapping("/Update")
    public void update(@RequestBody RefereeReview refereeReview) {
        refereeReviewService.update(refereeReview);
    }

    @DeleteMapping("/Delete")
    public void delete(@RequestBody RefereeReview refereeReview) {
        refereeReviewService.delete(refereeReview);
    }

    @GetMapping("/review/{id}")
    public RefereeReview getById(@PathVariable int id) {
        return refereeReviewService.getById(id);
    }
}
