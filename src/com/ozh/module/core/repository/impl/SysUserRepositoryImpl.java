/*
 * Web Site: http://www.ozh.com
 * Since 2010 - 2016
 */

package com.ozh.module.core.repository.impl;

import com.ozh.module.core.repository.SysUserRepositoryCustom;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.Resource;

/**
 * Created by kosam on 2016/2/28.
 * 这里只需要实现 RepositoryCustom 里面的接口
 */
public class SysUserRepositoryImpl implements SysUserRepositoryCustom {
    @Resource
    private JdbcTemplate jdbcTemplate;

}
