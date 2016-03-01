<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package com.ozh.${basepackage}.${moduleName}.service;

import com.ozh.common.service.IBaseService;
import ${basepackage}.${moduleName}.entity.${className};
public interface ${className}Service extends IBaseService<${className}, Long> {

}
