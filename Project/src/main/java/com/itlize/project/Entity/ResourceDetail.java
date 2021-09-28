package com.itlize.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ResourceDetail {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer projectColumnId;

    private Integer resourceId;

    private String description;

    public ResourceDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectColumnId() {
        return projectColumnId;
    }

    public void setProjectColumnId(Integer projectColumnId) {
        this.projectColumnId = projectColumnId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
