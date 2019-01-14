package com.power.using.params;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String regist(){
		System.out.println(name);
		return null;
	}
}
