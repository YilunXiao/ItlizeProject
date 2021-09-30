package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.Project;
import com.itlize.project.Entity.ProjectColumn;
import com.itlize.project.Entity.Resource;
import com.itlize.project.Repository.ProjectRepository;
import com.itlize.project.Repository.ResourceRepository;
import com.itlize.project.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project findOne(Integer id) throws Exception{
        return null;
    }

    @Override
    public List<Project> findAll(){
        return null;
    }

    @Override
    public Project findName(String resourceName) throws Exception{
        return null;
    }

    @Override
    public Boolean addOne(String projectName){
        return null;
    }

    @Override
    public Boolean updateName(Integer id, String projectName) throws Exception{
        return null;
    }

    @Override
    public Boolean deleteOne(Integer id) throws Exception{
        return false;
    }

    @Override
    public Boolean addResource(Resource resource){
        return null;
    }

    @Override
    public Boolean addColumn(ProjectColumn column){
        return null;
    }

}
