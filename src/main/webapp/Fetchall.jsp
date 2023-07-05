<%@page import="dto.Bookticket"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>booking_id</th>
<th>c_name</th>
<th>moviename</th>
<th>no-ticket</th>
<th>seatno</th>
<th>ticket_price</th>
<th>total_t_price</th>

<th>Edit</th>
<th>Delete</th>
</tr>
<% List<Bookticket> l1=(List<Bookticket>)request.getAttribute("data");%>
<% for(Bookticket b1:l1){%>
<tr>
	<td><%=b1.getBooking_id()%></td>
	<td><%= b1.getC_name()%></td>
	<td><%= b1.getMoviename()%></td>
	<td><%= b1.getNo_ticket()%></td>
	<td><%=b1.getSeatno() %></td>
	<td><%=b1.getTicket_price()%></td>
	<td><%=b1.getTotal_t_price()%></td>
<%} %>
<td><button padding="20px"><a href="Edit.jsp">Edit</a></button></td>
<td><button padding="20px"><a href="Delete.jsp">Delete</a></button></td>
</table>

</body>
</html>