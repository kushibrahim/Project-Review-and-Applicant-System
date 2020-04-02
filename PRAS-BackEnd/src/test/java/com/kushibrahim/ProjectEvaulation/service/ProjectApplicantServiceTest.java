package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectApplicant;
import com.kushibrahim.ProjectEvaulation.repository.IProjectApplicantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ProjectApplicantServiceTest {

    private static final int APPLICANT_ID = 1;
    private static final String APPLICANT_MAIL = "kushibrahim@gmail.com";
    private static final String APPLICANT_NAME = "Ibrahim";
    private static final String APPLICANT_PASSWORD = "123456";
    private static final String APPLICANT_PHONE = "+905397136791";

    @InjectMocks
    private ProjectApplicantServiceImpl projectApplicantService;

    @Mock
    private IProjectApplicantRepository projectApplicantRepository;

    @Test
    public void whenGetAllProjectApplicant_thenReturnProjectApplicantList(){
        ProjectApplicant projectApplicant = new ProjectApplicant();
        projectApplicant.setApplicantID(APPLICANT_ID);
        projectApplicant.setApplicantMail(APPLICANT_MAIL);
        projectApplicant.setApplicantName(APPLICANT_NAME);
        projectApplicant.setApplicantPassword(APPLICANT_PASSWORD);
        projectApplicant.setApplicantPhone(APPLICANT_PHONE);

        when(projectApplicantRepository.getAll()).thenReturn(Collections.singletonList(projectApplicant));
        List<ProjectApplicant> projectApplicants = projectApplicantService.getAll();
        ProjectApplicant response = projectApplicants.get(0);

        assertEquals(APPLICANT_ID, response.getApplicantID());
        assertEquals(APPLICANT_MAIL, response.getApplicantMail());
        assertEquals(APPLICANT_NAME, response.getApplicantName());
        assertEquals(APPLICANT_PASSWORD, response.getApplicantPassword());
        assertEquals(APPLICANT_PHONE, response.getApplicantPhone());
    }

    @Test
    public void whenGETProjectApplicant_thenReturnProjectApplicant(){
        ProjectApplicant projectApplicant = new ProjectApplicant();
        projectApplicant.setApplicantID(APPLICANT_ID);
        projectApplicant.setApplicantMail(APPLICANT_MAIL);
        projectApplicant.setApplicantName(APPLICANT_NAME);
        projectApplicant.setApplicantPassword(APPLICANT_PASSWORD);
        projectApplicant.setApplicantPhone(APPLICANT_PHONE);

        when(projectApplicantRepository.getById(APPLICANT_ID)).thenReturn(projectApplicant);

        assertEquals(APPLICANT_ID, projectApplicant.getApplicantID());
        assertEquals(APPLICANT_MAIL, projectApplicant.getApplicantMail());
        assertEquals(APPLICANT_NAME, projectApplicant.getApplicantName());
        assertEquals(APPLICANT_PASSWORD, projectApplicant.getApplicantPassword());
        assertEquals(APPLICANT_PHONE, projectApplicant.getApplicantPhone());

    }
}
