<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if ( request.getAttribute("success") instanceof String )
{
	String success = (String)request.getAttribute("success");
	if ( success.equals("ok") )
	{
%>
주문 성공 
<%
	}
	else
	{
%>
주문 실패 
<%
	}
}
%>
</body>
</html>