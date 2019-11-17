package com.iwen.service.impl;

import com.iwen.User;
import com.iwen.service.IUserService;
import com.iwen.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PackageName com.iwen.service.impl
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:41
 * @Version V1.0
 **/
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
