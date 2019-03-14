package com.company.xunwu.service;

import com.company.xunwu.entity.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findRoleByUserId(long userId);
}
