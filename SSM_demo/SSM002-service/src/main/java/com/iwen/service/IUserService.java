package com.iwen.service;

import com.iwen.User;
import com.iwen.service.base.IBaseService;

/**
 * @PackageName com.iwen.service
 * @ClassName IUserService
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:39
 * @Version V1.0
 **/
public interface IUserService extends IBaseService<User>{

    public User login(String username, String password);

}
