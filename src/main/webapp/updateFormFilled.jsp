<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateStudent">
		<pre>
			Id     :  <input type="text" name="id" value="${student.id}">
			Name   :  <input type="text" name="name" value="${student.name }">
			Branch :  <input type="text" name="branch" value="${student.branch}">
			
					  <input type="submit" name="submit">
		</pre>
	
	</form>
</body>
</html>