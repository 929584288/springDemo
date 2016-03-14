package com.ozh.core.service.impl;


import com.ozh.common.service.IBaseService;
import com.ozh.common.service.impl.AbstractBaseService;
import com.ozh.core.entity.ShoppingCartList;
import com.ozh.core.repository.ShoppingCartListRepository;
import com.ozh.core.service.ShoppingCartListService;
import com.ozh.module.shoppingcart.domain.CartItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * (服务层类)
 * @author by imall core generator
 * @version 1.0.0
 */
public class ShoppingCartListServiceImpl extends AbstractBaseService<ShoppingCartList, Long> implements ShoppingCartListService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @SuppressWarnings("unused")
    private ShoppingCartListRepository getSysRoleRepository() {
        return (ShoppingCartListRepository) baseRepository;
    }

    @Override
    public List<CartItem> findCartItemByUserId(Integer userId) {
        List<ShoppingCartList> lists = getSysRoleRepository().findByUserIdAndIsDelete(userId, "N");
        List<CartItem> cartItems = new ArrayList<CartItem>();
        for(ShoppingCartList cartList:lists){
            CartItem cartItem = new CartItem(cartList.getProductId().intValue(),cartList.getQuantity(),null,null,null);
            cartItems.add(cartItem);
        }
        return cartItems;
    }
}
