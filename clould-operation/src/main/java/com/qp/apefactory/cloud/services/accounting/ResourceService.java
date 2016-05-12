package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by QING on 2016/5/13.
 */
public interface ResourceService {

    public Resource save(Resource resource);

    public void delete(Resource resource);

    public Resource findById(Long id);

    public Page<Resource> findAll(Pageable pageable);
}
