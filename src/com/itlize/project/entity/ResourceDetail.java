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
@Table (name = "resource_detail")
public class ResourceDetail {
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="column_value")
	private String columnValue;
	
	@Column(name="description")
	private String description;
	
	//relationships
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="resource_id")
	private Resource resource;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="projectcolumns_id")
	private ProjectColumns projectColumns;
	
	//constructor
	public ResourceDetail() {
	}
	
	//getters
	//id, userName, password, role, timeCreated
	public int getID() {
		return id;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public String getDescription() {
		return description;
	}
	public Resource getResource() {
		return resource;
	}
	public ProjectColumns getProjectColumns() {
		return projectColumns;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public void setProjectColumns(ProjectColumns projectColumns) {
		this.projectColumns = projectColumns;
	}
}
