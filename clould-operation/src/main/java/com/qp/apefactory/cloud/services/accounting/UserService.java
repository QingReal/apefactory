package com.qp.apefactory.cloud.services.accounting;

import com.qp.apefactory.cloud.models.accounting.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;



/**
 * Created by QING on 2016/4/29.
 */

public interface UserService {

    public User save(User user);

    public void delete(User user);

    public User findById(Long id);

    public Page<User> findAll(Pageable pageable);

}
