package com.power.using.params;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String regist() {

		if("hashiqi".equals(username)&&"123".equals(password)){
			return SUCCESS;
		}else{
			return LOGIN;
		}
		
		
	}

}
