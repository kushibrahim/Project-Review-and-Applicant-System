package com.kushibrahim.ProjectEvaulation.entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "projectreferee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProjectReferee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refereeID")
    private int refereeID;

    @Column(name = "refereeName")
    @NotNull(message = "Name is a required field.")
    @Size(message = "Maximum 40 character", max = 40)
    @NotEmpty
    private String refereeName;

    @Column(name = "refereePassword")
    @NotNull(message = "Password is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String refereePassword;

    @Column(name = "refereeMail")
    @NotNull(message = "Mail is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    @Email(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}$", message = "You have entered an incorrect e-mail.")
    private String refereeMail;

    @Column(name = "refereePhone")
    @Size(message = "Maximum 20 character", max = 20)
    private String refereePhone;
}
