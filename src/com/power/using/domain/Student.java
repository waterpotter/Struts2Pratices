package com.power.using.domain;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private int id;
	private String username;
	private String password;
	private String gender;
	private String hobby;
	private Date birthday;
	private String email;
	private int grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Strudent [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ ", hobby=" + hobby + ", birthday=" + birthday + ", email=" + email + ", grade=" + grade + "]";
	}

	
	
}
