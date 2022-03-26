package com.main.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.domain.login.UserInfo;
import com.main.domain.login.UserInfoAccount;
import com.main.mapper.login.UserInfoMapper;

@Service
public class LoginService implements UserDetailsService {
 
    @Autowired
    private UserInfoMapper userInfoMapper;
 
    @Override
    public UserDetails loadUserByUsername(String username) 
                               throws UsernameNotFoundException {
        if (username.isEmpty()) {
            throw new UsernameNotFoundException("ユーザー名を入力してください");
        }
        UserInfo userPass = userInfoMapper.findByUsername(username);
        if(userPass == null){
            throw new UsernameNotFoundException("ユーザーが見つかりません");
        }
        return new UserInfoAccount(userPass, AuthorityUtils.createAuthorityList("USER"));
    }
 
    @Transactional
    public void registerUser(String username, String password){
        if(username.isEmpty() || password.isEmpty()){
            return;
        }
        UserInfo userInfo = userInfoMapper.findByUsername(username);
        if(userInfo == null){
            userInfo = new UserInfo(username, password);
            userInfoMapper.create(userInfo);
        }else{
        	userInfoMapper.update(userInfo);
        }
    }
}