
package com.ozh.core.repository.impl;

import com.ozh.core.repository.ShoppingCartListRepositoryCustom;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.Resource;

/**
 * (JPA持久化层)
 * @author by imall core generator
 * @version 1.0.0
 */
public class ShoppingCartListRepositoryImpl implements ShoppingCartListRepositoryCustom{

    @Resource
    private JdbcTemplate jdbcTemplate;

}
