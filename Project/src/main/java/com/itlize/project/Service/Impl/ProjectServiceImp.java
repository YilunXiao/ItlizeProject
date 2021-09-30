package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.Project;
import com.itlize.project.Repository.ProjectRepository;
import com.itlize.project.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepository repository;

    @Override
    public Project findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public Project save(Project project) {
        return repository.save(project);
    }
}
