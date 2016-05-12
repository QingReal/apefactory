package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.Resource;
import com.qp.apefactory.cloud.models.accounting.ResourceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by QING on 2016/5/13.
 */
public class ResourceServiceImpl implements ResourceService {

    @javax.annotation.Resource
    private ResourceRepository repository;

    public Resource save(Resource resource){
        return repository.save(resource);
    }

    public void delete(Resource resource){
         repository.delete(resource);
    }

    public Resource findById(Long id){
        return repository.findById(id);
    }

    public Page<Resource> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
}
