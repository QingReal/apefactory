package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.Permission;
import com.qp.apefactory.cloud.models.accounting.Role;
import com.qp.apefactory.cloud.models.accounting.RoleRepository;
import com.qp.apefactory.cloud.models.accounting.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by QING on 2016/4/29.
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleRepository repository;

    @PersistenceContext
    private EntityManager em;
    @Transactional
    public Role save(Role r){

        Role role = new Role();
        role.setName("管理员");
        role.setState(true);
        Permission permission = new Permission();
        permission.setName("增加");
        permission.setState(true);
        Set<Permission> permissions = new HashSet<Permission>();
        permissions.add(permission);
        role.setPermissions(permissions);
        repository.save(role);
        return null;
    }

    public void delete(Role role){
        repository.delete(role);
    }

    public Role findById(Long id){
        return repository.findById(id);
    }

    public Page<Role> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

}
