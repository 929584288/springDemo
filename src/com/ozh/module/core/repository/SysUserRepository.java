/*
 * Web Site: http://www.ozh.com
 * Since 2010 - 2016
 */

package com.ozh.module.core.repository;

import org.springframework.stereotype.Repository;
import com.ozh.common.repository.IBaseRepository;
import com.ozh.module.core.entity.SysUser;

@Repository
public class SysUserRepository extends IBaseRepository<SysUser, Long>, SysUserRepositoryCustom {

}
