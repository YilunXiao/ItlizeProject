package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

public class ProjectResourceTest {

    @Test
    void getId(){
        ProjectResource projectResource = new ProjectResource();
        Integer id = 10;
        projectResource.setId(id);
        assert(projectResource.getId()).equals(10);
    }

    @Test
    void getResourceAmount(){
        ProjectResource projectResource = new ProjectResource();
        Integer amount = 1010;
        projectResource.setResourceAmount(amount);
        assert(projectResource.getResourceAmount()).equals(1010);
    }

    @Test
    void getProject(){
        ProjectResource projectResource = new ProjectResource();
        Project project = new Project();
        projectResource.setProject(project);
        assert(projectResource.getProject()).equals(project);
    }

    @Test
    void getResource(){
        ProjectResource projectResource = new ProjectResource();
        Resource resource = new Resource();
        projectResource.setResource(resource);
        assert(projectResource.getResource()).equals(resource);
    }



}
