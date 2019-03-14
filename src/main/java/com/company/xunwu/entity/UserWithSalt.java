package com.company.xunwu.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.stream.Collector;

public class UserWithSalt extends User{


    private static final long serialVersionUID = -1661405883142493455L;

    private String salt;

//    public UserWithSalt(String username, String salt, String password, Collector<? extends GrantedAuthority> authorities){
//
////        super(username, password, authorities);
//        this.salt = salt;
//    }

    public String getSalt(){
        return salt;
    }
}
