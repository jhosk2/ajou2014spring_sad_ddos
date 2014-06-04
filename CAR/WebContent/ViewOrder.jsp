<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
<link href="w2ui-1.3.2/w2ui-1.3.2.min.css" rel="stylesheet" type="text/css"/> 
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="w2ui-1.3.2/w2ui-1.3.2.min.js"></script>
<script type="text/javascript">
$().ready(function(){
$('#grid').w2grid({
    name: 'grid',
    header: 'List of Names',
    show: {
        toolbar: true,
        footer: true
    },
    columns: [
        { field: 'recid', caption: 'ID', size: '50px', sortable: true, attr: 'align=center' },
        { field: 'table', caption: 'Table No.', size: '30%', sortable: true, resizable: true },
        { field: 'order', caption: 'Order', size: '30%', sortable: true, resizable: true },
        { field: 'date', caption: 'Date', size: '20%', resizable: true },
        { field: 'served', caption: 'Served', size: '30px', resizable: true },
    ],
    searches: [
        { field: 'table', caption: 'Last Name', type: 'text' },
        { field: 'served', caption: 'First Name', type: 'text' },
    ],
    sortData: [{ field: 'recid', direction: 'ASC' }],
    records: [
        { recid: 1, fname: 'John', lname: 'doe', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 2, fname: 'Stuart', lname: 'Motzart', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 3, fname: 'Jin', lname: 'Franson', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 4, fname: 'Susan', lname: 'Ottie', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 5, fname: 'Kelly', lname: 'Silver', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 6, fname: 'Francis', lname: 'Gatos', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 7, fname: 'Mark', lname: 'Welldo', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 8, fname: 'Thomas', lname: 'Bahh', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 9, fname: 'Sergei', lname: 'Rachmaninov', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 20, fname: 'Jill', lname: 'Doe', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 21, fname: 'Frank', lname: 'Motzart', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 22, fname: 'Peter', lname: 'Franson', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 23, fname: 'Andrew', lname: 'Ottie', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 24, fname: 'Manny', lname: 'Silver', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 25, fname: 'Ben', lname: 'Gatos', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 26, fname: 'Doer', lname: 'Welldo', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 27, fname: 'Shashi', lname: 'bahh', email: 'jdoe@gmail.com', sdate: '4/3/2012' },
        { recid: 28, fname: 'Av', lname: 'Rachmaninov', email: 'jdoe@gmail.com', sdate: '4/3/2012' }
    ]
});});

</script>
</head>
<body>
<div id="grid" style="height: 450px">
</div>
</body>
</html>