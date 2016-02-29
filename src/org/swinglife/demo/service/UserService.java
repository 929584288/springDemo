package org.swinglife.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.swinglife.demo.vo.UserVo;

/**
 * service 只读
 * Created by tgx on 2015/5/27.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    public UserVo getUserInfo() {
        UserVo userVo = new UserVo();
        userVo.setUserName("kosam");
        userVo.setAge(25);
        return userVo;
    }
}
