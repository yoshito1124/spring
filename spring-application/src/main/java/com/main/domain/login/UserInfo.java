package com.main.domain.login;

import lombok.Data;

@Data
public class UserInfo {

	public UserInfo(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/** メールアドレス */
	private String username;

	/** パスワード */
	private String password;
}