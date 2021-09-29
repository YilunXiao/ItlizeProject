package com.itlize.project.Repository;

import com.itlize.project.Entity.ProjectColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectColumnRepository extends JpaRepository<ProjectColumn, Integer> {
}
