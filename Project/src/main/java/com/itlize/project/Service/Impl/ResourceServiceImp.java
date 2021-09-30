package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.Resource;
import com.itlize.project.Entity.ResourceDetail;
import com.itlize.project.Repository.ResourceDetailRepository;
import com.itlize.project.Repository.ResourceRepository;
import com.itlize.project.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImp implements ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private ResourceDetailRepository resourceDetailRepository;

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
        return resourceRepository.findAll();
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

    @Override
    public Boolean addDetail(Integer resourceId, Integer resourceDetailId) throws Exception{
        Resource resource = resourceRepository.findResourceById(resourceId);
        if (resource == null){
            throw new Exception("The resource doesn't exist.");
        }
        ResourceDetail resourceDetail = resourceDetailRepository.findResourceDetailById(resourceDetailId);
        if (resourceDetail == null){
            throw new Exception("The resource detail doesn't exist.");
        }
        List<ResourceDetail> list = resource.getResourceDetails();
        if(list.contains(resourceDetail)){
            throw new Exception("The detail has been added to the list.");
        }else{
            list.add(resourceDetail);
            resource.setResourceDetails(list);
            resourceRepository.save(resource);
        }
        return true;
    }

    @Override
    public Boolean removeDetail(Integer resourceId, Integer resourceDetailId) throws Exception{
        Resource resource = resourceRepository.findResourceById(resourceId);
        ResourceDetail resourceDetail = resourceDetailRepository.findResourceDetailById(resourceDetailId);
        if (resource == null){
            throw new Exception("The resource doesn't exist.");
        }
        if (resourceDetail == null){
            throw new Exception("The resource detail doesn't exist.");
        }
        List<ResourceDetail> list = resource.getResourceDetails();
        if(list.contains(resourceDetail)){
            list.remove(resourceDetail);
            resource.setResourceDetails(list);
            resourceRepository.save(resource);
        }else{
            throw new Exception("The detail has been added to the list.");
        }
        return true;
    }
}
