<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td.table {
		width: 100px;
		height: 150px;
		background-color: green;
	}
</style>
</head>
<body>
	<form action="TableStatus" method="get">
	<Table>
		<tr>
			<td class="table"></td>
			<td class="table"></td>
			<td class="table"></td>
			<td class="table"></td>
		</tr>
		<tr>
			<td><button type="submit" name="tid" value="1">Table 1</button></td>
			<td><button type="submit" name="tid" value="2">Table 2</button></td>
			<td><button type="submit" name="tid" value="3">Table 3</button></td>
			<td><button type="submit" name="tid" value="4">Table 4</button></td>
		</tr>
	</Table>
	</form>
</body>
</html>