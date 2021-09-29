package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;
import java.util.Date;


public class TestProjectEntity {

    @Test
    public void projectTestID(){
        // Given
        Project project = new Project();
        int expected = 10;
        project.setId(expected);
        // When
        int actual = project.getId();
        // Then
        assert(actual == expected);
    }

    @Test
    public void projectTestUser(){
        // Given
        Project project = new Project();
        User expected = new User();
        // When
        project.setUser(expected);
        // Then
        assert(project.getUser().equals(expected));
    }

    @Test
    public void projectTimeCreated(){

    }

}