package com.mozisun.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mozisun.springbootmybatisplus.entity.User;
import com.mozisun.springbootmybatisplus.service.UserService;
import com.mozisun.springbootmybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author moZiA
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2025-06-10 15:19:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




