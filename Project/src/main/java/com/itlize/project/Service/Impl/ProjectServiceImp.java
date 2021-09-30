package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.Project;
import com.itlize.project.Repository.ProjectRepository;
import com.itlize.project.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project findOne(Integer id) throws Exception{
        Project project = projectRepository.findProjectById(id);
        if (project == null){
            throw new Exception ("No project found by id " + id);
        }
        return project;
    }

    @Override
    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    @Override
    public Project findName(String projectName) throws Exception{
        Project project = projectRepository.findProjectByName(projectName);
        if (project == null){
            throw new Exception ("No project found by name " + projectName);
        }
        return project;
    }

    @Override
    public Boolean addOne(String projectName){
        Project newProject = new Project(projectName);
        newProject.setTimeCreated(new Date());
        newProject.setTimeModified(new Date());
        projectRepository.saveAndFlush(newProject);
        return true;
    }

    @Override
    public Boolean updateName(Integer id, String projectName) throws Exception{
        Project project = projectRepository.findProjectById(id);
        if (project == null){
            throw new Exception ("The project doesn't exist.");
        }
        project.setName(projectName);
        project.setTimeModified(new Date());
        projectRepository.saveAndFlush(project);
        return true;
    }

    @Override
    public Boolean deleteOne(Integer id) throws Exception{
        Project project = projectRepository.findProjectById(id);
        if (project == null){
            throw new Exception ("Failed. The project doesn't exist.");
        }
        projectRepository.deleteById(id);
        return true;
    }

}
