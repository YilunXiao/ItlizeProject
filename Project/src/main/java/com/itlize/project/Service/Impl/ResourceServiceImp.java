package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.Resource;
import com.itlize.project.Repository.ResourceRepository;
import com.itlize.project.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImp implements ResourceService {
    @Autowired
    private ResourceRepository repository;

    @Override
    public Resource findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<Resource> findAll() {
        return repository.findAll();
    }

    @Override
    public Resource save(Resource resource) {
        return repository.save(resource);
    }
}
