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
@Table(name = "project_columns")
public class ProjectColumns {
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="column_name")
	private String columnName;
	
	@Column(name="type")
	private String type;
	
	@Column(name="formula_text")
	private String formulaText;
	
	//relationships
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="project_id")
	private Project project;
	
	//constructor
	public ProjectColumns() {
	}
	
	//getters
	public int getID() {
		return id;
	}
	public String getColumnName() {
		return columnName;
	}
	public String type() {
		return type;
	}
	public String getFormulaText() {
		return formulaText;
	}
	public Project getProject() {
		return project;
	}
	//setters
	public void setID(int id) {
		this.id = id;
	}
	public void setType(String columnName) {
		this.columnName = columnName;
	}
	public void setFormulaText(String formulaText) {
		this.formulaText = formulaText;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
