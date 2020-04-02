package com.kushibrahim.ProjectEvaulation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "refereereview")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RefereeReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refereeReviewID")
    private int refereeReviewID;

    @Column(name = "refereeReviewSummary")
    @NotNull(message = "Review Summary is a required field.")
    @Size(message = "Maximum 500 character", max = 500)
    @NotEmpty
    private String refereeReviewSummary;

    @Column(name = "refereeReviewDecision")
    @NotNull(message = "Review Decision is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String refereeReviewDecision;

    @Column(name = "refereeReviewDateTime")
    @DateTimeFormat(pattern = "^((19|20)\\\\d\\\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$")
    private Date refereeReviewDateTime;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "refereeID")
    //@JsonIgnore --> usage for fetch = FetchType.LAZY
    //@JsonIgnore --> don't convert to JSON
    @JoinColumn(name = "refereeID")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private ProjectReferee refereeID;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "projectID")
    //@JsonIgnore --> usage for fetch = FetchType.LAZY
    //@JsonIgnore --> don't convert to JSON
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectID")
    @JsonIgnore
    private Project projectID;
}
