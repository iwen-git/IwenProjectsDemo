package com.iwen.mapper.base;

/**
 * @PackageName com.iwen.mapper.base
 * @ClassName BaseMapper
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:25
 * @Version V1.0
 **/
public interface BaseMapper<T> {
    public T findById(Integer id);

    public T findByUUID(String uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
