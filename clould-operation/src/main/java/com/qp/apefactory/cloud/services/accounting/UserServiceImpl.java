package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.Permission;
import com.qp.apefactory.cloud.models.accounting.Role;
import com.qp.apefactory.cloud.models.accounting.User;
import com.qp.apefactory.cloud.models.accounting.UserRepository;
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
 * Created by QING on 2016/5/4.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserRepository repository;
    @Transactional
    public User save(User user) {
        User u = new User();
        u.setName("小明");
        u.setPassword("123456");
        u.setEmail("857617647@qq.com");
        u.setMobile("18826411766");
        Role role = new Role();
        role.setName("管理员");
        role.setState(true);
        Set<Role> roles = new HashSet<Role>();
        roles.add(role);
        Permission permission = new Permission();
        permission.setName("增加");
        permission.setState(true);
        Set<Permission> permissions = new HashSet<Permission>();
        permissions.add(permission);
        role.setPermissions(permissions);
        u.setRoles(roles);
        repository.save(u);
        return u;
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public User findById(Long id) {
        return repository.findById(id);
    }

    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }



}
