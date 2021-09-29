package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

public class ResourceDetailTest {

    @Test
    void getId(){
        ResourceDetail detail = new ResourceDetail();
        Integer id = 857857;
        detail.setId(id);
        assert(detail.getId()).equals(857857);
    }

    @Test
    void getDescription(){
        ResourceDetail detail = new ResourceDetail();
        String description = "Ich bin Karl, wie geht's?";
        detail.setDescription(description);
        assert(detail.getDescription()).equals("Ich bin Karl, wie geht's?");
    }

    @Test
    void getProjectColumn(){
        ResourceDetail detail = new ResourceDetail();
        ProjectColumn projectColumn = new ProjectColumn();
        detail.setProjectColumn(projectColumn);
        assert(detail.getProjectColumn()).equals(projectColumn);
    }

    @Test
    void getResource(){
        ResourceDetail detail = new ResourceDetail();
        Resource resource = new Resource();
        detail.setResource(resource);
        assert(detail.getResource()).equals(resource);
    }
}
