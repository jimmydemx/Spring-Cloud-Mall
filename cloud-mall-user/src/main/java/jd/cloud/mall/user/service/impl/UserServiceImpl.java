package jd.cloud.mall.user.service.impl;

import jd.cloud.mall.user.model.dao.UserMapper;
import jd.cloud.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;



//    @Override
//    public String testSQL() {
//        String s = userMapper.testSQL();
//        return s;
//    }
}
