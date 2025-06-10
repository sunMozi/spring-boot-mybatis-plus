package com.mozisun.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mozisun.springbootmybatisplus.entity.Address;
import com.mozisun.springbootmybatisplus.service.AddressService;
import com.mozisun.springbootmybatisplus.mapper.AddressMapper;
import org.springframework.stereotype.Service;

/**
* @author moZiA
* @description 针对表【address】的数据库操作Service实现
* @createDate 2025-06-10 15:19:26
*/
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address>
    implements AddressService{

}




