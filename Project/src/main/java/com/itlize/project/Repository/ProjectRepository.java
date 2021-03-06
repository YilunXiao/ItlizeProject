package com.itlize.project.Repository;

import com.itlize.project.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    Project findProjectById(Integer id);
    List<Project> findAll();
    Project findProjectByName(String name);
}