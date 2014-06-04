<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function showTableStatus(re) {
		switch (re) {
		case 1:
			alert("이 테이블 이용 가능");
			location.href = "./demo_menu.html";
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
<body onload="showTableStatus(<%= request.getAttribute("tableStatus") %>)">
</body>
</html>