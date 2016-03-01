<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package com.ozh.${basepackage}.${moduleName}.repository.impl;

import ${basepackage}.${moduleName}.repository.${className}RepositoryCustom;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.Resource;

/**
 * Created by kosam on 2016/2/28.
 * 这里只需要实现 RepositoryCustom 里面的接口
 */
public class ${className}RepositoryImpl implements ${className}RepositoryCustom {
    @Resource
    private JdbcTemplate jdbcTemplate;

}
