package com.kushibrahim.ProjectEvaulation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "specialistreview")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SpecialistReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialistReviewID")
    private int specialistReviewID;

    @Column(name = "specialistReviewSummary")
    @NotNull(message = "Review Summary is a required field.")
    @Size(message = "Maximum 500 character", max = 500)
    @NotEmpty
    private String specialistReviewSummary;

    @Column(name = "specialistReviewDecision")
    @NotNull(message = "Review Decision is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String specialistReviewDecision;

    @Column(name = "specialistReviewDateTime")
    @DateTimeFormat(pattern = "^((19|20)\\\\d\\\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$")
    private Date specialistReviewDateTime;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "specialistID")
    //@JsonIgnore --> usage for fetch = FetchType.LAZY
    //@JsonIgnore --> don't convert to JSON
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialistID")
    @JsonIgnore
    private ProjectSpecialist specialistID;
}
