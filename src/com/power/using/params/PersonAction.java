package com.power.using.params;

import com.opensymphony.xwork2.ActionSupport;
import com.power.using.domain.Person;

public class PersonAction extends ActionSupport {
	
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String regist() {
		if("hashiqi".equals(person.getUsername())&&"123".equals(person.getPassword())){
			return SUCCESS;
		}else{
			return LOGIN;
		}
	}
	

}
