package com.itlize.project.Service;

import com.itlize.project.Entity.ProjectResource;
import java.util.List;

public interface ProjectResourceService {
    public ProjectResource findById(Integer Id);
    List<ProjectService> findAll();
    public ProjectResource save(ProjectResource projectResource);
}
