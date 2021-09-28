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
@Table(name="project_resource")
public class ProjectResource {
	
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="amount")
	private int amount;
	
	//relationships
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="project_id")
	private Project project;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="resource_id")
	private Resource resource;
	
	//constructor
	public ProjectResource() {
	}
	public ProjectResource(Project project, Resource resource, int amount) {
		this.project = project;
		this.resource = resource;
		this.amount = amount;
	}
	
	//getters
	//id, userName, password, role, timeCreated
	public int getID() {
		return id;
	}
	public int getAmount() {
		return amount;
	}
	public Project getProject() {
		return project;
	}
	public Resource getResource() {
		return resource;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
