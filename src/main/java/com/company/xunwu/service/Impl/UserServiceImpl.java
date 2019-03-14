package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.dao.RoleMapper;
import com.company.xunwu.dao.UserMapper;
import com.company.xunwu.entity.Role;
import com.company.xunwu.entity.User;
import com.company.xunwu.service.RoleService;
import com.company.xunwu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleService roleService;

    @Override
    public User findUserByName(String userName) {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", userName);

        User user = userMapper.selectOne(queryWrapper);

        List<Role> roleList = roleService.findRoleByUserId(user.getId());

        if (roleList == null || roleList.isEmpty()) {
            throw new DisabledException("权限非法");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        roleList.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        user.setAuthorityList(authorities);
        return user;
    }
}
