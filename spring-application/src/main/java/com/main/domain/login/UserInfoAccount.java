package com.main.domain.login;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserInfoAccount implements UserDetails {
	 
    /** UserPassオブジェクト */
    private UserInfo userInfo;
 
    /** ユーザー権限情報 */
    private Collection<GrantedAuthority> authorities;
 
    public UserInfoAccount(UserInfo userInfo, Collection<GrantedAuthority> authorities){
        this.userInfo = userInfo;
        this.authorities = authorities;
    }
 
    /**
     * ユーザー権限情報を取得する
     * @return ユーザー権限情報
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
 
    /**
     * パスワードを取得する
     * @return パスワード
     */
    @Override
    public String getPassword() {
        return userInfo.getPassword();
    }
 
    /**
     * ユーザー名を取得する
     * @return ユーザー名
     */
    @Override
    public String getUsername() {
        return userInfo.getUsername();
    }
 
    /**
     * アカウントが期限切れでないかを取得する
     * @return アカウントが期限切れでないか
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    /**
     * アカウントがロックされていないかを取得する
     * @return アカウントがロックされていないか
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    /**
     * アカウントが認証期限切れでないかを取得する
     * @return アカウントが認証期限切れでないか
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    /**
     * アカウントが利用可能かを取得する
     * @return アカウントが利用可能か
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}