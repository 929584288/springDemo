package org.swinglife.demo.functions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.swinglife.demo.service.UserService;
import org.swinglife.demo.vo.UserVo;
import org.swinglife.utils.SpringContextHolder;

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
