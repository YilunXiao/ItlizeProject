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
@Table(name="project")
public class Project {

	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="time_created")
	private Timestamp timeCreated;
	
	//relationships
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(targetEntity = ProjectResource.class, cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Set<ProjectResource> projectResource;
	
	@OneToMany(targetEntity = ProjectResource.class, cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Set<ProjectColumns> projectColumns;
	
	//constructor
	public Project() {
	}
	
	//getters
	//id, userName, password, role, timeCreated
	public int getID() {
		return id;
	}
	public Timestamp getTimeCreated() {
		return timeCreated;
	}
	public User getUser() {
		return user;
	}
	public Set<ProjectResource> getProjectResource() {
		return projectResource;
	}
	public Set<ProjectColumns> getProjectColumns() {
		return projectColumns;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setProjectResource(Set<ProjectResource> projectResource) {
		this.projectResource = projectResource;
	}
	public void setProjectColumns(Set<ProjectColumns> projectColumns) {
		this.projectColumns = projectColumns;
	}
	
}
