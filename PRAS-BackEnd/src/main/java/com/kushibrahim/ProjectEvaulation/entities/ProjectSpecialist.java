package com.kushibrahim.ProjectEvaulation.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "projectspecialist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProjectSpecialist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialistID")
    private int specialistID;

    @Column(name = "specialistName")
    @NotNull(message = "Name is a required field.")
    @Size(message = "Maximum 40 character", max = 40)
    @NotEmpty
    private String specialistName;

    @Column(name = "specialistPassword")
    @NotNull(message = "Password is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String specialistPassword;

    @Column(name = "specialistMail")
    @NotNull(message = "Mail is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    @Email(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}$", message = "You have entered an incorrect e-mail.")
    private String specialistMail;

    @Column(name = "specialistPhone")
    @Size(message = "Maximum 20 character", max = 20)
    private String specialistPhone;
}
