package com.main.mapper.login;

import org.apache.ibatis.annotations.Mapper;

import com.main.domain.login.UserInfo;

@Mapper
public interface UserInfoMapper {
 
    /**
     * ユーザーパスワードデータテーブル(user_pass)からユーザー名をキーにデータを取得する
     * @param name ユーザー名
     * @return ユーザー名をもつデータ
     */
    UserInfo findByUsername(String username);
 
    /**
     * 指定したユーザーパスワードデータテーブル(user_pass)のデータを追加する
     * @param userPass ユーザーパスワードデータテーブル(user_pass)の追加データ
     */
    void create(UserInfo userInfo);
 
    /**
     * 指定したユーザーパスワードデータテーブル(user_pass)のデータを更新する
     * @param userPass ユーザーパスワードデータテーブル(user_pass)の更新データ
     */
    void update(UserInfo userInfo);
 
}