package com.company.xunwu.service;

import com.company.xunwu.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findUserByName(String userName);


}
