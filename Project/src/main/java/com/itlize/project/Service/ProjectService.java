package com.itlize.project.Service;

import com.itlize.project.Entity.Project;
import java.util.List;

public interface ProjectService {
    public Project findById(Integer Id);
    List<Project> findAll();
    public Project save(Project project);
}
