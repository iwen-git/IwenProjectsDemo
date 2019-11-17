package com.iwen.service.base;

import com.iwen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @PackageName com.iwen.service
 * @ClassName BaseServiceImpl
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:37
 * @Version V1.0
 **/
public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    protected UserMapper userMapper;

}
