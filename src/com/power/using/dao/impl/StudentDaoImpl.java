package com.power.using.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.power.using.dao.StudentDao;
import com.power.using.domain.Student;
import com.power.using.util.DBCPUtil;

public class StudentDaoImpl implements StudentDao {

	private QueryRunner qr=new QueryRunner(DBCPUtil.getDataSource());
	
	@Override
	public void save(Student s) {
		
		try {
			qr.update("insert into students (id,username,password,gender,hobby,birthday,email,grade) values(?,?,?,?,?,?,?,?)"
					,s.getId(),s.getUsername(),s.getPassword(),s.getGender(),s.getHobby(),s.getBirthday().toLocaleString(),
					s.getEmail(),s.getGrade());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
