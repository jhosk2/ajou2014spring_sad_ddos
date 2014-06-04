<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	button {
		height: 40px;
		width: 150px;
	}
</style>
</head>
<body>
	<form action="TableStatus" method="get">
	<jsp:include page="ShowTable.jsp"></jsp:include>
	<Table>
		<tr>
			<td><button type="submit" name="tid" value="1">NFC</button></td>
			<td><button type="submit" name="tid" value="2">NFC</button></td>
			<td><button type="submit" name="tid" value="3">NFC</button></td>
			<td><button type="submit" name="tid" value="4">NFC</button></td>
		</tr>
	</Table>
	</form>
</body>
</html>