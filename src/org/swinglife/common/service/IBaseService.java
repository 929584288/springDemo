package org.swinglife.common.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.swinglife.common.entity.BaseEntity;
import org.swinglife.common.repository.IBaseRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kosam on 2016/2/28.
 * 基础服务类 接口
 */
public interface IBaseService<M extends BaseEntity, ID extends Serializable>{

    public abstract void setBaseRepository(IBaseRepository<M, ID> paramBaseRepository);

    public abstract M save(M paramM);

    public abstract M saveAndFlush(M paramM);

    public abstract void delete(ID paramID);

    public abstract void delete(M paramM);

    public abstract void delete(List<ID> ids);

    public abstract M findOne(ID paramID);

    public abstract boolean exists(ID paramID);

    public abstract long count();

    public abstract List<M> findAll();

    public abstract List<M> findAll(Sort paramSort);

    public abstract Page<M> findAll(Pageable paramPageable);
}
