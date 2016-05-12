package com.qp.apefactory.cloud.models.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;


/**
 * Created by QING on 2016/4/28.
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

    public T save(T obj);

    public void delete(T obj);

    public T findById(ID id);

    public Page<T> findAll(Pageable pageable);

}
