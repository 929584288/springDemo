package org.swinglife.core.demo.repository;

import org.swinglife.common.repository.IBaseRepository;
import org.swinglife.core.demo.entity.UserInfo;

/**
 * Created by kosam on 2016/2/28.
 * 这里定义的是不需要实现的 持久层接口，
 * 接口需要严格按照 JPA 规范
 */
public interface UserInfoRepository extends IBaseRepository<UserInfo, Long>, UserInfoRepositoryCustom {
}
