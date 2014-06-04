<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Result</title>
</head>
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<script type="text/javascript">

function success()
{
	$('body').css("background-color","#F9BF3B");
	document.getElementById('success').style.display = "";
}

function fail()
{
	$('body').css("background-color","#E08283");
	document.getElementById('fail').style.display = "";
}

</script>
<body style="color:white">
<div id="success" style="display:none">
Your order is on the way. Thank you!
</div>
<div id="fail" style="display:none">
Something is wrong..
</div>
</body>
</html>
<script type="text/javascript">
<%
if ( request.getAttribute("success") instanceof String )
{
	String success = (String)request.getAttribute("success");
	if ( success.equals("ok") )
	{
%>
	success();	
<%
	}
	else
	{
%>
	fail();
<%
	}
}
%>
</script>