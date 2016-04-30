package com.qp.apefactory.cloud.services;

import com.qp.apefactory.cloud.models.accounting.User;
import com.qp.apefactory.cloud.models.accounting.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by QING on 2016/4/29.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
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
