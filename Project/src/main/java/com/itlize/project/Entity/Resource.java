package com.itlize.project.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "resource_code")
    private String resourceCode;

    @Column(name = "cost")
    private Integer cost;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "resource",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Resource> resources;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "resource",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<ResourceDetail> resourceDetail;

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

    public List<Resource> getResources() {
        return resources;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public List<ResourceDetail> getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(List<ResourceDetail> resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

}
