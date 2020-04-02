package com.kushibrahim.ProjectEvaulation.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "projectapplicant")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProjectApplicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicantID")
    private int ApplicantID;

    @Column(name = "applicantName")
    @NotNull(message = "Name is a required field.")
    @Size(message = "Maximum 40 character", max = 40)
    @NotEmpty
    private String ApplicantName;

    @Column(name = "applicantPassword")
    @NotNull(message = "Password is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String ApplicantPassword;

    @Column(name = "applicantMail")
    @NotNull(message = "Mail is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    @Email(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}$", message = "You have entered an incorrect e-mail.")
    private String ApplicantMail;

    @Column(name = "applicantPhone")
    @Size(message = "Maximum 20 character", max = 20)
    private String ApplicantPhone;
}
