package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.ProjectSpecialist;
import com.kushibrahim.ProjectEvaulation.service.ProjectSpecialistServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = ProjectSpecialistController.class)
public class ProjectSpecialistControllerTest extends BaseControllerTest {

    private static final int SPECIALIST_ID = 1;
    private List<ProjectSpecialist> specialistList;
    private ProjectSpecialist projectSpecialist;

    @MockBean
    private ProjectSpecialistServiceImpl projectSpecialistService;

    @Test
    public void whenGetAllProjectSpecialist_thenReturnProjectSpecialistListSuccess() throws Exception {
        when(projectSpecialistService.getAllSpecialists()).thenReturn(specialistList);
        mockMvc.perform(get("/specialists"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectSpecialistService, times(1)).getAllSpecialists();
        verifyNoMoreInteractions(projectSpecialistService);
    }

    @Test
    public void whenGetByIdProjectSpecialist_thenReturnProjectSpecialistSuccess() throws Exception {
        when(projectSpecialistService.getById(SPECIALIST_ID)).thenReturn(projectSpecialist);
        mockMvc.perform(get("/specialists/specialist/{id}", SPECIALIST_ID))
                .andDo(print())
                 .andExpect(status().isOk());

        verify(projectSpecialistService, times(1)).getById(SPECIALIST_ID);
        verifyNoMoreInteractions(projectSpecialistService);
    }
}
