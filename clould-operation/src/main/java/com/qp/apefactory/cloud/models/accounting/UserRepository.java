package com.qp.apefactory.cloud.models.accounting;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


/**
 * Created by QING on 2016/4/28.
 */
@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User,Long> {

    public User save(User user);

    public void delete(User user);

    public User findById(Long id);

    public Page<User> findAll(Pageable pageable);

}
