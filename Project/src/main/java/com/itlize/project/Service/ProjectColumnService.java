package com.itlize.project.Service;

import com.itlize.project.Entity.ProjectColumn;

import java.util.List;

public interface ProjectColumnService {
    public ProjectColumn findById(Integer Id);
    List<ProjectColumn> findAll();
    public ProjectColumn save(ProjectColumn projectColumn);
}
