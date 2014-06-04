<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="CAR.ItemDescription"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<table>
	<%
		ArrayList<ItemDescription> ary = (ArrayList<ItemDescription>)request.getAttribute("listItemDescription");
		for ( ItemDescription i : ary )
		{
	%>
		<tr>
			<td class="pic">
				<img src="basil_pesto_olive_pasta.png">
			</td>
			<td class="desc">
				<p class="dishEn">BASIL PESTO<br>OLIVE PASTA</p>
				<p class="dishKo">바질 페스토 올리브 파스타</p>
				<p class="dishPrice">19,690원</p>
				<input class="detail" type="button" value="> 자세히 보기">
				<input class="insert" type="button" value="메뉴 담기 +">
			</td>
		</tr>
	<%
		}
	%>
	<%=ary.size()%>
	</table>
</body>
</html>