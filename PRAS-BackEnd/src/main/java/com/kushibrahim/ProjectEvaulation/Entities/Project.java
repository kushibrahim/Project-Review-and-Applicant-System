package com.kushibrahim.ProjectEvaulation.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectID")
    private int projectID;

    @Column(name = "projectTitle")
    @NotNull(message = "Project title is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String projectTitle;

    @Column(name = "projectSummary")
    @NotNull(message = "Project Summary is a required field.")
    @Size(message = "Maximum 500 character", max = 500)
    @NotEmpty
    private String projectSummary;

    @Column(name = "projectKeyword")
    @NotNull(message = "Project Keyword is a required field.")
    @Size(message = "Maximum 100 character", max = 100)
    @NotEmpty
    private String projectKeyword;

    @Column(name = "projectDecision", insertable = false, updatable = false)
    @NotNull(message = "Project Decision is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String projectDecision;

    @Column(name = "projectHypothesis")
    @Size(message = "Maximum 500 character", max = 500)
    private String projectHypothesis;

    @Column(name = "projectPurpose")
    @NotNull(message = "Project Purpose is a required field.")
    @Size(message = "Maximum 500 character", max = 500)
    @NotEmpty
    private String projectPurpose;

    @Column(name = "projectMethod")
    @NotNull(message = "Project Method is a required field.")
    @Size(message = "Maximum 500 character", max = 500)
    @NotEmpty
    private String projectMethod;

    @Column(name = "projectBudget")
    @NotNull(message = "Project Budget is a required field.")
    @NotEmpty
    private int projectBudget;

    @Column(name = "projectImageUrl")
    @Size(message = "Maximum 250 character", max = 250)
    private String projectImageUrl;

    @Column(name = "projectCreateDatetime")
    @DateTimeFormat(pattern = "^((19|20)\\\\d\\\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$")
    private Date projectCreateDatetime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialistReviewID")
    @JsonIgnore
    private SpecialistReview specialistReviewID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicantID")
    @JsonIgnore
    private ProjectApplicant applicantID;
}
