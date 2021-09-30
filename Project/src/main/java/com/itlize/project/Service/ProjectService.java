package com.itlize.project.Service;

import com.itlize.project.Entity.Project;
import com.itlize.project.Entity.ProjectColumn;
import com.itlize.project.Entity.Resource;

import java.util.List;

public interface ProjectService {
    Project findOne(Integer id) throws Exception;
    List<Project> findAll();
    Project findName(String resourceName) throws Exception;
    Boolean addOne(String projectName);
    Boolean updateName(Integer id, String projectName) throws Exception;
    Boolean deleteOne(Integer id) throws Exception;
    Boolean addResource(Resource resource);
    Boolean addColumn(ProjectColumn column);
}
