package com.itlize.project;

import com.itlize.project.Entity.Project;

public class TestProjectEntity {
    private Project project;

    @Before
    public void setUp() {
        project = new Project();
    }

    @Test
    public void projectTest1(){
        // Given

        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

}