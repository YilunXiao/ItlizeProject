package com.itlize.project.Repository;

import com.itlize.project.Entity.Project;
import com.itlize.project.Entity.ProjectResource;
import com.itlize.project.Entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectResourceRepository extends JpaRepository<ProjectResource, Integer> {
    ProjectResource findProjectResourceById(Integer id);
    ProjectResource findProjectResourceByProjectAndResource(Project project, Resource resource);
}