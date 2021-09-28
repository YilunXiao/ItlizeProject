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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.itlizeproject.entity.*;

@Entity
@Table(name="user")
public class User {
	
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="time_created")
	private Timestamp timeCreated;
	
	//relationships
	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="user",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<Project> projects;
	
	//constructor
	public User() {
	}
	
	public User(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	//getters
	//id, userName, password, role, timeCreated
	public int getID() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
	public Timestamp getTimeCreated() {
		return timeCreated;
	}
	public List<Project> getProjects() {
		return projects;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	// add convenience methods for bi-directional relationship
	
	public void add(Project tempProject) {
		
		if (projects == null) {
			projects = new ArrayList<>();
		}
		
		projects.add(tempProject);
		
		tempProject.setUser(this);
	}
	
}
