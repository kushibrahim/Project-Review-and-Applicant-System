package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.Project;
import com.kushibrahim.ProjectEvaulation.repository.IProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ProjectServiceTest {

    private static final int PROJECT_ID = 1;
    private static final int PROJECT_BUDGET = 10000;
    private static final Date PROJECT_CREATE_DATETIME = new Date("2020/04/01");
    private static final String PROJECT_DECISION = "ACCEPT";
    private static final String PROJECT_HYPOTHESIS = "Project Evaulation";
    private static final String PROJECT_IMAGE_URL = "www.splash.io/132";
    private static final String PROJECT_KEYWORD = "evaulation, referee, project";
    private static final String PROJECT_METHOD = "Research";
    private static final String PROJECT_PURPOSE = "DIGITAL TRANSFORMATION";
    private static final String PROJECT_SUMMARY = "Project Applicant and Evaulation System";
    private static final String PROJECT_TITLE = "PAES";

    @InjectMocks
    private IProjectServiceImpl projectService;

    @Mock
    private IProjectRepository projectRepository;

    @Test
    public void whenGetAllProject_thenReturnProjectList(){
        Project project = new Project();
        project.setProjectID(PROJECT_ID);
        project.setProjectBudget(PROJECT_BUDGET);
        project.setProjectCreateDatetime(PROJECT_CREATE_DATETIME);
        project.setProjectDecision(PROJECT_DECISION);
        project.setProjectHypothesis(PROJECT_HYPOTHESIS);
        project.setProjectImageUrl(PROJECT_IMAGE_URL);
        project.setProjectKeyword(PROJECT_KEYWORD);
        project.setProjectMethod(PROJECT_METHOD);
        project.setProjectPurpose(PROJECT_PURPOSE);
        project.setProjectSummary(PROJECT_SUMMARY);
        project.setProjectTitle(PROJECT_TITLE);

        when(projectRepository.getAllProjects()).thenReturn(Collections.singletonList(project));
        List<Project> projects = projectService.getAllProjects();
        Project response = projects.get(0);

        assertEquals(PROJECT_ID, response.getProjectID());
        assertEquals(PROJECT_BUDGET, response.getProjectBudget());
        assertEquals(PROJECT_CREATE_DATETIME, response.getProjectCreateDatetime());
        assertEquals(PROJECT_DECISION, response.getProjectDecision());
        assertEquals(PROJECT_HYPOTHESIS, response.getProjectHypothesis());
        assertEquals(PROJECT_IMAGE_URL, response.getProjectImageUrl());
        assertEquals(PROJECT_KEYWORD, response.getProjectKeyword());
        assertEquals(PROJECT_METHOD, response.getProjectMethod());
        assertEquals(PROJECT_PURPOSE, response.getProjectPurpose());
        assertEquals(PROJECT_SUMMARY, response.getProjectSummary());
        assertEquals(PROJECT_TITLE, response.getProjectTitle());
    }

    @Test
    public void whenGetByIdProject_thenReturnProject(){
        Project project = new Project();
        project.setProjectID(PROJECT_ID);
        project.setProjectBudget(PROJECT_BUDGET);
        project.setProjectCreateDatetime(PROJECT_CREATE_DATETIME);
        project.setProjectDecision(PROJECT_DECISION);
        project.setProjectHypothesis(PROJECT_HYPOTHESIS);
        project.setProjectImageUrl(PROJECT_IMAGE_URL);
        project.setProjectKeyword(PROJECT_KEYWORD);
        project.setProjectMethod(PROJECT_METHOD);
        project.setProjectPurpose(PROJECT_PURPOSE);
        project.setProjectSummary(PROJECT_SUMMARY);
        project.setProjectTitle(PROJECT_TITLE);

        when(projectRepository.getById(PROJECT_ID)).thenReturn(project);

        assertEquals(PROJECT_ID, project.getProjectID());
        assertEquals(PROJECT_BUDGET, project.getProjectBudget());
        assertEquals(PROJECT_CREATE_DATETIME, project.getProjectCreateDatetime());
        assertEquals(PROJECT_DECISION, project.getProjectDecision());
        assertEquals(PROJECT_HYPOTHESIS, project.getProjectHypothesis());
        assertEquals(PROJECT_IMAGE_URL, project.getProjectImageUrl());
        assertEquals(PROJECT_KEYWORD, project.getProjectKeyword());
        assertEquals(PROJECT_METHOD, project.getProjectMethod());
        assertEquals(PROJECT_PURPOSE, project.getProjectPurpose());
        assertEquals(PROJECT_SUMMARY, project.getProjectSummary());
        assertEquals(PROJECT_TITLE, project.getProjectTitle());
    }
}
