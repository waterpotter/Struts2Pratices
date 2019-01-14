<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证码登录页面</title>
</head>
<body>
	
	<form action="">
	
		username:<input/><br>
		password:<input/><br>
		验证码:<input name="code" size="6"/><img alt="aa" src="${pageContext.request.contextPath}/captcha.action"><br>
		<input type="submit" value="提交"/>
	</form>

	
	

</body>
</html>