package com.power.using.params;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.power.using.domain.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private Customer customer=new Customer();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String regist() {
		if("hashiqi".equals(customer.getUsername())&&"123".equals(customer.getPassword())){
			return SUCCESS;
		}else{
			return LOGIN;
		}
	}

	//此方法会在动作方法执行前先执行；得到当前对应的模型对象并把模型对象压入值栈的栈顶。setUsername先调用栈顶对象的该方法。
	//后面会有值栈（存放数据的大仓库）的详细介绍
	//这个方法其实是在ModelDrivenInterceptor这个拦截器中被调用
	//在webstruts3.xml中,访问这个<action>的name的时候,会先经过这个拦截器,然后回调用
	//这个方法,将数据bean(模型对象)push进值栈.
	@Override
	public Customer getModel() {
		
		return customer;
	}
	
}
