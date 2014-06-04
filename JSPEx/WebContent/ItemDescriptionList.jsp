<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="CAR.ItemDescription"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
<%	
	Object oList = request.getAttribute("listItemDescription");
	if ( oList instanceof ArrayList<?> )
	{
		ArrayList<?> ary = (ArrayList<?>)oList;
		
		for ( Object o : ary )
		{
			if ( o instanceof ItemDescription)
			{
				ItemDescription i = (ItemDescription)o;
%>
		<tr>
			<td class="pic">
				<img src="img/<%=i.getImgPath() %>">
			</td>
			<td class="desc">
				<p class="dishKo"><%=i.getName() %></p>
				<p class="dishPrice"><%=i.getPrice()%> 원</p>
				<p class="dishIngredient"><%=i.getIngredients()%></p>
				<p class="dishCalorie"><%=i.getCalorie()%>Cal</p>
				<p class="dishEstimateCookingTime">예상 조리시간 : <%=i.getEstimatedCookingTime()%></p>
				<input class="insert" type="button" value="메뉴 담기 +">
			</td>
		</tr>
<%
			}
		}
	}
%>
	</table>
</body>
</html>