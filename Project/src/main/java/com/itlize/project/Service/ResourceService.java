package com.itlize.project.Service;

import com.itlize.project.Entity.Resource;

import java.util.List;

public interface ResourceService {
    Resource findOne(Integer id) throws Exception;
    List<Resource> findAll();
    Resource findName(String resourceName) throws Exception;
    Resource findCode(String resourceCode) throws Exception;
    void addOne(String resourceName);
    void updateName(Integer id, String resourceName) throws Exception;
    void updateCode(Integer id, String resourceName) throws Exception;
    void deleteOne(Integer id) throws Exception;
}
