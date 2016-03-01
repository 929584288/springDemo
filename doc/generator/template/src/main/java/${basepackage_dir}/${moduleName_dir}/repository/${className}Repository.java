<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.${moduleName}.repository;

import org.springframework.stereotype.Repository;
import com.ozh.common.repository.IBaseRepository;
import ${basepackage}.${moduleName}.entity.${className};

@Repository
public class ${className}Repository extends IBaseRepository<${className}, Long>, ${className}RepositoryCustom {

}
