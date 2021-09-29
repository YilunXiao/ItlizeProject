package com.itlize.project.Entity;

import com.itlize.project.Entity.Project;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProjectEntity {
    private Project project;

    @Before
    public void setUp() {
        project = new Project();
    }

    @Test
    public void projectTestID(){
        // Given
        int expected = 10;
        project.setID(expected);
        // When
        int actual = project.getID();
        // Then
        Assert.assertEquals(expected, actual);
    }

}