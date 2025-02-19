package com.mqw.mybatisdbshiftdemo.service;

import com.mqw.mybatisdbshiftdemo.config.example.annotation.DataSource;
import com.mqw.mybatisdbshiftdemo.domain.Customer;
import com.mqw.mybatisdbshiftdemo.domain.Tag;
import com.mqw.mybatisdbshiftdemo.mapper.TagMapper;
import com.mqw.mybatisdbshiftdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
   private UserMapper userMapper;
   @Autowired
   private TagMapper tagMapper;

   @DataSource("master")
   public void getCustomerById(Long id){
           Customer customerById = userMapper.getCustomerById(id);
           System.out.println(customerById);
   }
   @DataSource("slave")
    public void getTagById(Long id){
       Tag tag=tagMapper.getTagById(id);
       System.out.println(tag);
   }


   
}
