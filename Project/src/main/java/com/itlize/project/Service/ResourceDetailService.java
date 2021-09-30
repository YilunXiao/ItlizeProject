package com.itlize.project.Service;

import com.itlize.project.Entity.ResourceDetail;
import java.util.List;

public interface ResourceDetailService {
    public ResourceDetail findById(Integer Id);
    List<ResourceDetail> findAll();
    public ResourceDetail save(ResourceDetail resourceDetail);
}
