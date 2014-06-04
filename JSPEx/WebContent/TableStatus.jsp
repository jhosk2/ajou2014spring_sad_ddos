<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.11.1min.js"></script>
<script type="text/javascript">
	function showTableStatus(re) {
		switch (re) {
		case 1:
			alert("테이블을 점유하였습니다.");
			document.forms["tableSuccess"].submit();
			break;
		case -1:
			alert("테이블이 이미 사용중입니다.");
			break;
		case -2:
			alert("잘못된 입력");
			break;
		}
	}
</script>
</head>
<body onload="showTableStatus(<%=request.getAttribute("tableStatus")%>)">
	<form id="tableSuccess" action="ItemDescriptionList" method="get">
		<input type="hidden" name="tid" value="<%=request.getAttribute("tid")%>">
	</form>
</body>
</html>