package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ResourceTest {

    @Test
    void getId(){
        Resource resource = new Resource();
        Integer id = 101;
        resource.setId(id);
        assert(resource.getId()).equals(101);
    }

    @Test
    void getName(){
        Resource resource = new Resource();
        String name = "Frau";
        resource.setName(name);
        assert(resource.getName()).equals("Frau");
    }

    @Test
    void getResourceCode(){
        Resource resource = new Resource();
        String resourceCode = "FEE1003";
        resource.setResourceCode(resourceCode);
        assert(resource.getResourceCode()).equals("FEE1003");
    }

    @Test
    void getCost(){
        Resource resource = new Resource();
        Integer cost = 9421;
        resource.setCost(cost);
        assert(resource.getCost()).equals(9421);
    }

    @Test
    void getProjectResources(){
        ProjectResource projectResource1 = new ProjectResource();
        Resource resource = new Resource();
        List<ProjectResource> projectResources = new ArrayList<ProjectResource>();
        projectResources.add(projectResource1);
        resource.setProjectResources(projectResources);
        assert(resource.getProjectResources()).equals(projectResources);
    }

    @Test
    void getResourceDetails(){
        ResourceDetail detail1 = new ResourceDetail();
        Resource resource = new Resource();
        List<ResourceDetail> resourceDetails = new ArrayList<ResourceDetail>();
        resourceDetails.add(detail1);
        resource.setResourceDetails(resourceDetails);
        assert(resource.getResourceDetails()).equals(resourceDetails);
    }

}
