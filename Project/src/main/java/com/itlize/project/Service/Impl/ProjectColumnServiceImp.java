package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.ProjectColumn;
import com.itlize.project.Repository.ProjectColumnRepository;
import com.itlize.project.Service.ProjectColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectColumnServiceImp implements ProjectColumnService {
    @Autowired
    private ProjectColumnRepository repository;

    @Override
    public ProjectColumn findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<ProjectColumn> findAll() {
        return repository.findAll();
    }

    @Override
    public ProjectColumn save(ProjectColumn projectColumn) {
        return repository.save(projectColumn);
    }
}
