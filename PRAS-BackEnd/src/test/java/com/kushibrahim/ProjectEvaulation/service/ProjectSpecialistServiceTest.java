package com.kushibrahim.ProjectEvaulation.service;

import com.kushibrahim.ProjectEvaulation.entities.ProjectSpecialist;
import com.kushibrahim.ProjectEvaulation.repository.IProjectSpecialistRepository;
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
public class ProjectSpecialistServiceTest {

    private static final int SPECIALIST_ID = 1;
    private static final String SPECIALIST_MAIL = "oktay@tr.ibm.com";
    private static final String SPECIALIST_NAME = "Oktay KUŞ";
    private static final String SPECIALSIT_PASSWORD = "123456";
    private static final String SPECIALIST_PHONE = "+905387111422";

    @InjectMocks
    private ProjectSpecialistServiceImpl projectSpecialistService;

    @Mock
    private IProjectSpecialistRepository projectSpecialistRepository;

    @Test
    public void whenGetAllProjectSpecialist_thenReturnProjectSpecialistList(){
        ProjectSpecialist projectSpecialist = new ProjectSpecialist();
        projectSpecialist.setSpecialistID(SPECIALIST_ID);
        projectSpecialist.setSpecialistMail(SPECIALIST_MAIL);
        projectSpecialist.setSpecialistName(SPECIALIST_NAME);
        projectSpecialist.setSpecialistPassword(SPECIALSIT_PASSWORD);
        projectSpecialist.setSpecialistPhone(SPECIALIST_PHONE);

        when(projectSpecialistRepository.getAllSpecialists()).thenReturn(Collections.singletonList(projectSpecialist));
        List<ProjectSpecialist> projectSpecialists = projectSpecialistService.getAllSpecialists();
        ProjectSpecialist response = projectSpecialists.get(0);

        assertEquals(SPECIALIST_ID, response.getSpecialistID());
        assertEquals(SPECIALIST_MAIL, response.getSpecialistMail());
        assertEquals(SPECIALIST_NAME, response.getSpecialistName());
        assertEquals(SPECIALSIT_PASSWORD, response.getSpecialistPassword());
        assertEquals(SPECIALIST_PHONE, response.getSpecialistPhone());
    }

    @Test
    public void whenGetByIdProjectSpecialist_thenReturnProjectSpecialist(){
        ProjectSpecialist projectSpecialist = new ProjectSpecialist();
        projectSpecialist.setSpecialistID(SPECIALIST_ID);
        projectSpecialist.setSpecialistMail(SPECIALIST_MAIL);
        projectSpecialist.setSpecialistName(SPECIALIST_NAME);
        projectSpecialist.setSpecialistPassword(SPECIALSIT_PASSWORD);
        projectSpecialist.setSpecialistPhone(SPECIALIST_PHONE);

        when(projectSpecialistRepository.getById(SPECIALIST_ID)).thenReturn(projectSpecialist);

        assertEquals(SPECIALIST_ID, projectSpecialist.getSpecialistID());
        assertEquals(SPECIALIST_MAIL, projectSpecialist.getSpecialistMail());
        assertEquals(SPECIALIST_NAME, projectSpecialist.getSpecialistName());
        assertEquals(SPECIALSIT_PASSWORD, projectSpecialist.getSpecialistPassword());
        assertEquals(SPECIALIST_PHONE, projectSpecialist.getSpecialistPhone());
    }
}
