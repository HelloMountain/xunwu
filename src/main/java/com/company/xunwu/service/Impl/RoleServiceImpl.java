package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.dao.RoleMapper;
import com.company.xunwu.entity.Role;
import com.company.xunwu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUserId(long userId) {

        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        return roleMapper.selectList(queryWrapper.eq("userId", userId));
    }
}
