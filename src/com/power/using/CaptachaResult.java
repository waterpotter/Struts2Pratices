package com.power.using;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

import cn.dsna.util.images.ValidateCode;

public class CaptachaResult extends StrutsResultSupport{

	private int width=200;
	private int height=100;
	private int numCount=6;
	private int grLineNum=100;
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}

	public int getGrLineNum() {
		return grLineNum;
	}

	public void setGrLineNum(int grLineNum) {
		this.grLineNum = grLineNum;
	}

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation) throws Exception {
		
		
		ValidateCode vc=new ValidateCode(width,height, numCount, grLineNum);
		BufferedImage image = vc.getBuffImg();
		HttpServletResponse response = ServletActionContext.getResponse();
		ImageIO.write(image, "jpeg", response.getOutputStream());
		
		
		
	}

	

}
