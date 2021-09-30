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
    private ResourceRepository resourceRepository;

    @Override
    public Resource findOne(Integer id) throws Exception{
        Resource resource = resourceRepository.findResourceById(id);
        if (resource == null){
            throw new Exception ("No resource found by id " + id);
        }
        return resource;
    }

    @Override
    public List<Resource> findAll(){
        List<Resource> list = resourceRepository.findAll();
        return list;
    }

    @Override
    public Resource findName(String resourceName) throws Exception{
        Resource resource = resourceRepository.findResourceByName(resourceName);
        if (resource == null){
            throw new Exception ("No resource found by name " + resourceName);
        }
        return resource;
    }

    @Override
    public Resource findCode(String resourceCode) throws Exception{
        Resource resource = resourceRepository.findResourceByCode(resourceCode);
        if (resource == null){
            throw new Exception ("No resource found by code " + resourceCode);
        }
        return resource;
    }

    @Override
    public Boolean addOne(String resourceName){
        Resource newResource = new Resource(resourceName);
        resourceRepository.saveAndFlush(newResource);
        return true;
    }

    @Override
    public Boolean updateName(Integer id, String resourceName) throws Exception{
        Resource resource = resourceRepository.findResourceById(id);
        if (resource == null){
            throw new Exception ("The resource doesn't exist.");
        }
        resource.setName(resourceName);
        resourceRepository.saveAndFlush(resource);
        return true;
    }

    @Override
    public Boolean updateCode(Integer id, String resourceCode) throws Exception{
        Resource resource = resourceRepository.findResourceById(id);
        if (resource == null){
            throw new Exception ("The resource doesn't exist.");
        }
        resource.setResourceCode(resourceCode);
        resourceRepository.saveAndFlush(resource);
        return true;
    }

    @Override
    public Boolean deleteOne(Integer id) throws Exception{
        Resource resource = resourceRepository.findResourceById(id);
        if (resource == null){
            throw new Exception ("Failed. The resource doesn't exist.");
        }
        resourceRepository.deleteById(id);
        return true;
    }
}
