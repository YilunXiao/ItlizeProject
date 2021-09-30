package com.itlize.project.Service;

import com.itlize.project.Entity.Project;
import com.itlize.project.Entity.ProjectResource;
import com.itlize.project.Entity.Resource;

import java.util.List;

public interface ProjectResourceService {
    Boolean addOne(Integer projectId, Integer resourceId) throws Exception;
    Integer findId(Integer projectId, Integer resourceId) throws Exception;
    ProjectResource findOne(Integer Id) throws Exception;
    Boolean updateAmount(Integer projectId, Integer resourceId, Integer amount) throws Exception;
    Boolean deleteOne(Integer id) throws Exception;
}
