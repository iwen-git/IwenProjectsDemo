package com.iwen.mapper;

import com.iwen.User;
import com.iwen.mapper.base.BaseMapper;

/**
 * @PackageName com.iwen.mapper
 * @ClassName UserMapper
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:26
 * @Version V1.0
 **/
public interface UserMapper extends BaseMapper<User> {
    @Override
    User findById(Integer id);
}
