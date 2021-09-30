package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.ResourceDetail;
import com.itlize.project.Repository.ResourceDetailRepository;
import com.itlize.project.Service.ResourceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceDetailServiceImp implements ResourceDetailService {
    @Autowired
    private ResourceDetailRepository repository;

    @Override
    public ResourceDetail findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<ResourceDetail> findAll() {
        return repository.findAll();
    }

    @Override
    public ResourceDetail save(ResourceDetail resourceDetail) {
        return repository.save(resourceDetail);
    }
}
