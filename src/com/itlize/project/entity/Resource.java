package com.itlize.project.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.itlizeproject.entity.*;

@Entity
@Table(name = "resource")
public class Resource {
	
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="resource_code")
	private String resourceCode;
	
	@Column(name="cost")
	private int cost;
	
	//relationships
	@OneToMany(targetEntity = ProjectResource.class, cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Set<ProjectResource> projectResource;
	
	@OneToMany(targetEntity = ProjectResource.class, cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Set<ResourceDetail> resourceDetail;
	
	//constructor
	public Resource() {
	}
	public Resource(String name, String resource_code, int cost) {
		this.name = name;
		this.resourceCode = resource_code;
		this.cost = cost;
	}
	
	//getters
	//id, userName, password, role, timeCreated
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getResourceCode() {
		return resourceCode;
	}
	public int getCost() {
		return cost;
	}
	public Set<ProjectResource> getProjectResource() {
		return projectResource;
	}
	public Set<ResourceDetail> getResourceDetail() {
		return resourceDetail;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setProjectResource(Set<ProjectResource> projectResource) {
		this.projectResource = projectResource;
	}
	public void setResourceDetail(Set<ResourceDetail> resourceDetail) {
		this.resourceDetail = resourceDetail;
	}
}
