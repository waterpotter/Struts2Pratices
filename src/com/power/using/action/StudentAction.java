package com.power.using.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.power.using.domain.Student;
import com.power.using.service.BusinessService;
import com.power.using.service.impl.BusinessServiceImpl;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {

	private Student student = new Student();

	private BusinessService s = new BusinessServiceImpl();

	private String[] hobbies;

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	//因为已经压入栈顶,所以就可以直接使用,此处可以不写set  get 方法
	/*public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
*/
	public String regist() {
		try {
			if(hobbies!=null&&hobbies.length>0){
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < hobbies.length; i++) {
					if(i<hobbies.length-1){
						sb.append(",");
					}
					sb.append(hobbies[i]);
				}
				student.setHobby(sb.toString());
			}
			
			s.registStudent(student);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}

	@Override
	public Student getModel() {

		return student;
	}

}
