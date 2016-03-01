/*
 * Web Site: http://www.ozh.com
 * Since 2010 - 2016
 */

package com.ozh.module.core.service;


import com.ozh.common.service.impl.AbstractBaseService;
import com.ozh.module.core.entity.SysUser;
import com.ozh.module.core.repository.SysUserRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import com.ozh.commons.base.*;
import com.ozh.commons.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.ozh.module.core.domain.*;
import com.ozh.module.core.dao.*;
import com.ozh.module.core.service.*;
import com.ozh.service.*;

/**
 * @key gen www.ozh.com
 * @version 1.0
 * @since 1.0
 */

@Service
public interface SysUserServiceImpl extends AbstractBaseService<SysUser,Long> implements SysUserService{

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unused")
	SysUserRepository getSysUserRepository() {
		return (SysUserRepository) baseRepository;
	}

}
