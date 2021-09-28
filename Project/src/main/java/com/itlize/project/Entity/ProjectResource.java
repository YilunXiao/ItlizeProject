package com.itlize.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectResource {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer projectId;

    private Integer resourceId;

    private Integer resourceAmount;

    public ProjectResource() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
    public Integer getResourceAmount() {
        return resourceAmount;
    }

    public void setResourceAmount(Integer resourceAmount) {
        this.resourceAmount = resourceAmount;
    }


}
