package com.itlize.project.Repository;

import com.itlize.project.Entity.ResourceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceDetailRepository extends JpaRepository<ResourceDetail, Integer> {
}
