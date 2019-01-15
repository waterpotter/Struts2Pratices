<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head />
<!-- 引入框架里的css和js -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:form action="regist" namespace="/student">
		<s:textfield name="username" label="用户名" requiredLabel="true"
			requiredPosition="left"></s:textfield>
		<s:password name="password" label="密 码" requiredLabel="true"
			requiredPosition="left"></s:password>
		<!-- list的值是一个ONGL表达式,创建了一个map对象,必须有name -->
		<s:radio list="#{'male':'男性','femal':'女性' }" name="gender" label="性别"
			requiredLabel="true" requiredPosition="left"></s:radio>
		<!-- 同上,list取值,是一个List对象,必须有name -->
		<s:checkboxlist list="{'吃饭','睡觉','java'}" name="hobbies" label="爱好"></s:checkboxlist>
		<s:textfield name="birthday" label="出生日期(yyyy-MM-dd)"></s:textfield>
		<s:textfield name="email" label="邮箱"></s:textfield>
		<s:textfield name="grade" label="成绩分数"></s:textfield>
		
		<s:submit value="注册"></s:submit>
		
	</s:form>

	<br>
	<form action="${pageContext.request.contextPath}/student/regist"
		method="post">
		<table border="1" width="438">
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><input type="radio" name="gender" value="male" />男性 <input
					type="radio" name="gender" value="female" />女性</td>
			</tr>
			<tr>
				<td>爱好:</td>
				<td><input type="checkbox" name="hobby" value="吃饭" />吃饭 <input
					type="checkbox" name="hobby" value="睡觉" />睡觉 <input type="checkbox"
					name="hobby" value="java" />java</td>
			</tr>
			<tr>
				<td>出生日期(yyyy-MM-dd)</td>
				<td><input type="text" name="birthday" /></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>成绩:</td>
				<td><input type="text" name="grade" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="注册"></td>

			</tr>

		</table>
	</form>

</body>
</html>