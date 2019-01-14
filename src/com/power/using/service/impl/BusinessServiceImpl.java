package com.power.using.service.impl;

import com.power.using.dao.StudentDao;
import com.power.using.dao.impl.StudentDaoImpl;
import com.power.using.domain.Student;
import com.power.using.service.BusinessService;
import com.power.using.util.IdGenertor;

public class BusinessServiceImpl implements BusinessService {

	private StudentDao studentDao=new StudentDaoImpl();
	
	@Override
	public void registStudent(Student s) {
		studentDao.save(s);
		
	}

}
