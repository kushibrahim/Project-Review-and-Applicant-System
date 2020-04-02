package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.ProjectApplicant;
import com.kushibrahim.ProjectEvaulation.service.ProjectApplicantServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = ProjectApplicantController.class)
public class ProjectApplicantControllerTest extends BaseControllerTest {

    private static final int APPLICANT_ID = 1;
    private ProjectApplicant projectApplicant;
    private List<ProjectApplicant> projectApplicantList;

    @MockBean
    private ProjectApplicantServiceImpl projectApplicantService;

    @Test
    public void whenGetAllProjectApplicant_thenReturnProjectApplicantSuccess() throws Exception {
        when(projectApplicantService.getAll()).thenReturn(projectApplicantList);
        mockMvc.perform(get("/applicant"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectApplicantService, times(1)).getAll();
        verifyNoMoreInteractions(projectApplicantService);
    }

    @Test
    public void whenGetByIdProjectApplicant_thenReturnProjectApplicantSuccess() throws Exception {
        when(projectApplicantService.getById(APPLICANT_ID)).thenReturn(projectApplicant);
        mockMvc.perform(get("/applicant/user/{id}", APPLICANT_ID))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectApplicantService, times(1)).getById(APPLICANT_ID);
        verifyNoMoreInteractions(projectApplicantService);
    }
}
