package com.itlize.project.Service;

import com.itlize.project.Entity.Resource;

import java.util.List;

public interface ResourceService {
    public Resource findById(Integer id);
    List<Resource> findAll();
    public Resource save(Resource resource);
}
