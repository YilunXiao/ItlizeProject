package com.itlize.project.Repository;

import com.itlize.project.Entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
    Resource findResourceById(Integer id);
    List<Resource> findAll();
    Resource findResourceByName(String name);
    Resource findResourceByCode(String code);
}
