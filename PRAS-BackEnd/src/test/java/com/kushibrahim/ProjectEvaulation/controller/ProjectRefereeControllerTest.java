package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;
import com.kushibrahim.ProjectEvaulation.service.ProjectRefereeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = ProjectRefereeController.class)
public class ProjectRefereeControllerTest extends BaseControllerTest {

    private static final int REFEREE_ID = 1;
    private List<ProjectReferee> refereeList;
    private ProjectReferee referee;

    @MockBean
    private ProjectRefereeServiceImpl projectRefereeService;

    @Test
    public void whenGetAllProjectReferee_thenReturnProjectRefereeListSuccess() throws Exception {
        when(projectRefereeService.getAllReferees()).thenReturn(refereeList);
        mockMvc.perform(get("/referees"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectRefereeService, times(1)).getAllReferees();
        verifyNoMoreInteractions(projectRefereeService);
    }

    @Test
    public void whenGetByIdProjectReferee_thenReturnProjectRefereeSuccess() throws Exception {
        when(projectRefereeService.getById(REFEREE_ID)).thenReturn(referee);
        mockMvc.perform(get("/referees/referee/{id}", REFEREE_ID))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectRefereeService, times(1)).getById(REFEREE_ID);
        verifyNoMoreInteractions(projectRefereeService);
    }
}
