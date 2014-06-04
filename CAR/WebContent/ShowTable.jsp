<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="CAR.Table" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Table status</title>
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<script type="text/javascript">
$().ready(function(){
	setTimeout(function(){document.location.reload(true);},3000);
});
</script>
<style type="text/css">
	th {
		text-align: center;
	}
	
	td {
		text-align: center;
		width: 300px;
	}
	
	img {
		width: 180px;
		height: 250px;
	}
</style>
</head>
<body>
	<Table>
		<thead>
			<tr>
<%	
	ArrayList<Table> listTable = (ArrayList<Table>)request.getAttribute("tableList");
	for(int i=0; i<listTable.size(); i++) {
%>
				<th>Table <%=i%></th>
<%
	}
%>
			</tr>
		</thead>
		<tr>
	<%
		for(int i=0; i<listTable.size(); i++) {
			if(listTable.get(i).requestTableStatus()) {
	%>
			<td class="table"><img id="table<%=i%>" src="img/occupied_table.png"></td>
	<%
			} else {	
	%>
			<td class="table"><img id="table<%=i%>" src="img/empty_table.png"></td>
	<%
			}
		}
	%>
		</tr>
	</Table>
</body>
</html>