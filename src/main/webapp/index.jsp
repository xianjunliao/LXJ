<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
<script src="${base}/lxj/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		
		
	});
</script>
</head>
<body>
	<form id="userForm" action="${base}/lxj/login" method="post">
		<input name="username" type="text" /> <br /> <input name="password"
			type="password" /> <br />
	<button id="button_submit" type="submit">提交</button>
	</form>
	${ok}
</body>
</html>