package com.mozisun.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mozisun.springbootmybatisplus.pojo.User;

/**
 * 用户表数据库操作接口
 * <p>
 * 继承自 MyBatis-Plus 提供的 BaseMapper，
 * 自动拥有常用的 CRUD（增删改查）方法，无需手写 SQL。
 * <p>
 * 具体的自定义数据库操作方法可在此接口中定义，
 * 并在对应的 Mapper XML 或注解中实现。
 *
 * @see com.baomidou.mybatisplus.core.mapper.BaseMapper
 */
public interface UserMapper extends BaseMapper<User> {
  // 如果需要自定义方法，可以在此添加，如：
  // List<User> selectUsersByStatus(Integer status);
}
