package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.ProjectResource;
import com.itlize.project.Repository.ProjectResourceRepository;
import com.itlize.project.Service.ProjectResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectResourceServiceImp implements ProjectResourceService {
    @Autowired
    private ProjectResourceRepository repository;

    @Override
    public ProjectResource findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<ProjectResource> findAll() {
        return repository.findAll();
    }

    @Override
    public ProjectResource save(ProjectResource projectResource) {
        return repository.save(projectResource);
    }
}
