package com.ozh.demo.functions;

import com.ozh.demo.service.UserService;
import com.ozh.demo.vo.UserVo;
import org.springframework.stereotype.Service;
import com.ozh.demo.service.UserService;
import com.ozh.demo.vo.UserVo;
import com.ozh.utils.SpringContextHolder;

/**
 * Created by tgx on 2015/5/27.
 */
@Service
public class UserApi {

    private UserApi() {}

    public static UserVo getUserInf() {
        System.out.println(SpringContextHolder.getApplicationContext());
        return SpringContextHolder.getBean(UserService.class).getUserInfo();
    }
}
