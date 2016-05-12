package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.Role;
import com.qp.apefactory.cloud.models.accounting.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Created by QING on 2016/4/29.
 */

public interface RoleService {

    public Role save(Role role);

    public void delete(Role role);

    public Role findById(Long id);

    public Page<Role> findAll(Pageable pageable);

}
