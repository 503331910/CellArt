package com.project.service;


import com.project.dao.UserEntityMapper;
import com.project.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
@Service(value = "userService")
public class UserService {

    @Resource(name = "userDao")
    private UserEntityMapper userEntityMapper;

    public ResultData login(HttpSession session, String name, String pwd) {
        ResultData resultData = new ResultData();
        List<UserEntity> list = userEntityMapper.selectByName(name);
        if (list == null || list.size() == 0) {
            resultData.setStatus(RequestMsg.ERROR_SELECT);
        } else {
            UserEntity entity = list.get(0);
            String password = entity.getUserPwd();
            if (!pwd.equals(password)) {
                resultData.setStatus(RequestMsg.ERROR_PWD);
            } else {
                resultData.setStatus(RequestMsg.SUCCESS);
                resultData.setData(entity);
                session.setAttribute("userId", entity.getUserId());
            }
        }
        return resultData;
    }
}
