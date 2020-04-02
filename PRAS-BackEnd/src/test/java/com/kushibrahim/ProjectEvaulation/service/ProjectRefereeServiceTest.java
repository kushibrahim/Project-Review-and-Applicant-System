package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectReferee;
import com.kushibrahim.ProjectEvaulation.repository.IProjectRefereeRepository;
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
public class ProjectRefereeServiceTest {

    private static final int REFEREE_ID = 1;
    private static final String REFEREE_MAIL = "vsahin@sakarya.edu.tr";
    private static final String REFEREE_NAME = "Veysel Harun ŞAHİN";
    private static final String REFEREE_PASSWORD = "123456";
    private static final String REFEREE_PHONE = "+905309647822";

    @InjectMocks
    private ProjectRefereeServiceImpl projectRefereeService;

    @Mock
    private IProjectRefereeRepository projectRefereeRepository;

    @Test
    public void whenGetAllProjectReferee_thenReturnProjectRefereeList(){
        ProjectReferee projectReferee = new ProjectReferee();
        projectReferee.setRefereeID(REFEREE_ID);
        projectReferee.setRefereeMail(REFEREE_MAIL);
        projectReferee.setRefereeName(REFEREE_NAME);
        projectReferee.setRefereePassword(REFEREE_PASSWORD);
        projectReferee.setRefereePhone(REFEREE_PHONE);

        when(projectRefereeRepository.getAllReferees()).thenReturn(Collections.singletonList(projectReferee));
        List<ProjectReferee> projectReferees = projectRefereeService.getAllReferees();
        ProjectReferee response = projectReferees.get(0);

        assertEquals(REFEREE_ID, response.getRefereeID());
        assertEquals(REFEREE_MAIL, response.getRefereeMail());
        assertEquals(REFEREE_NAME, response.getRefereeName());
        assertEquals(REFEREE_PASSWORD, response.getRefereePassword());
        assertEquals(REFEREE_PHONE, response.getRefereePhone());
    }

    @Test
    public void whenGetProjectApplicant_thenReturnProjectApplicant(){
        ProjectReferee projectReferee = new ProjectReferee();
        projectReferee.setRefereeID(REFEREE_ID);
        projectReferee.setRefereeMail(REFEREE_MAIL);
        projectReferee.setRefereeName(REFEREE_NAME);
        projectReferee.setRefereePassword(REFEREE_PASSWORD);
        projectReferee.setRefereePhone(REFEREE_PHONE);

        when(projectRefereeRepository.getById(REFEREE_ID)).thenReturn(projectReferee);

        assertEquals(REFEREE_ID, projectReferee.getRefereeID());
        assertEquals(REFEREE_MAIL, projectReferee.getRefereeMail());
        assertEquals(REFEREE_NAME, projectReferee.getRefereeName());
        assertEquals(REFEREE_PASSWORD, projectReferee.getRefereePassword());
        assertEquals(REFEREE_PHONE, projectReferee.getRefereePhone());
    }
}
