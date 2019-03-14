package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.dao.UserMapper;
import com.company.xunwu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsServiceImpl  {

    @Autowired
    private UserMapper userMapper;

//    @Override
//    public User loadUserByUserName(String userName) throws UsernameNotFoundException {
//
//        QueryWrapper<User> userWrapper = new QueryWrapper<>();
//        userWrapper.eq("name", userName);
//
//        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
//        User user = userMapper.selectOne(userWrapper);
//        if (user == null){
//            throw new UsernameNotFoundException("user not found");
//        }

//        authorityList.add(new SimpleGrantedAuthority(user.getRole().toString()));

//        QueryWrapper<User> userWrapper = new QueryWrapper<>();
//        userWrapper.eq("name", userName);
//        return userMapper.selectOne(userWrapper);
//    }

}

