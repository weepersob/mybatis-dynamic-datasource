package com.mqw.mybatisdbshiftdemo.mapper;

import com.mqw.mybatisdbshiftdemo.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from customer where id = #{id}")
    Customer getCustomerById(Long id);
}

