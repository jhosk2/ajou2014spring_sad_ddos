<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="CAR.Order" %>
    <%@page import="CAR.ItemDescription" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View order</title>
<link href="w2ui-1.3.2/w2ui-1.3.2.min.css" rel="stylesheet" type="text/css"/> 
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="w2ui-1.3.2/w2ui-1.3.2.min.js"></script>
<script type="text/javascript">
$().ready(function(){
$('#grid').w2grid({
    name: 'grid',
    header: 'List of Orders',
    show: {
        toolbar: true,
        footer: true
    },
    columns: [
        { field: 'recid', caption: 'ID', size: '50px', sortable: true, attr: 'align=center' },
        { field: 'table', caption: 'Table No.', size: '80px', sortable: true, resizable: true },
        { field: 'order', caption: 'Order', size: '40%', sortable: true, resizable: true },
        { field: 'date', caption: 'Date', size: '20%', resizable: true },
    ],
    searches: [
        { field: 'table', caption: 'Table No', type: 'integer' },
        { field: 'served', caption: 'Served', type: 'boolean' },
    ],
    sortData: [{ field: 'served', direction: 'DESC' }],
    records: [
<%
	ArrayList<Order> ary = (ArrayList<Order>)request.getAttribute("ary");
	int index = 0;
	for ( Order o : ary ){
		++index;
		StringBuilder order = new StringBuilder();
		
		for ( ItemDescription i : o.getItem().getList() ){
			order.append(i.getName());
			order.append(' ');
		}
%>
              { recid: <%=index%>, table: '<%=o.getTable().getId()+1%>', order: '<%=order.toString()%>', date: '<%=o.getDateTime().toString()%>' },
<%
	}
%>
],
	onClick: function(event)
	{
		tid = this.get(event.recid).table;
		$.get("/CAR/Payment?tid="+(tid-1),function(event){
			if ( event =="ok")
			{
				this.remove(recid);
			}
		});
	}
});
setTimeout(function(){
	window.location.reload(true);
}, 5000);
});

</script>
</head>
<body>
<div id="grid" style="height: 450px">
</div>
</body>
</html>