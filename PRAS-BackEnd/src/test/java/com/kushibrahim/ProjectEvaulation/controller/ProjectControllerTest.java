package com.kushibrahim.ProjectEvaulation.controller;

import com.kushibrahim.ProjectEvaulation.base.BaseControllerTest;
import com.kushibrahim.ProjectEvaulation.entities.Project;
import com.kushibrahim.ProjectEvaulation.service.IProjectServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(value = ProjectController.class)
public class ProjectControllerTest extends BaseControllerTest {

    private List<Project> projects;
    private Project project;

    @MockBean
    private IProjectServiceImpl projectService;

    @Test
    public void whenGetAllProject_thenReturnProjectListSuccess() throws Exception {
        when(projectService.getAllProjects()).thenReturn(projects);
        mockMvc.perform(get("/projects"))
                .andDo(print())
                .andExpect(status().isOk());

        verify(projectService, times(1)).getAllProjects();
        verifyNoMoreInteractions(projectService);
    }
}
