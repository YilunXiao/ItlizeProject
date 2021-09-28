package com.itlize.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String resourceCode;

    private Integer cost;

    public Resource() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }
    public Integer getCost() {
        return cost;
    }

    public void setResourceCode(Integer cost) {
        this.cost = cost;
    }
}
