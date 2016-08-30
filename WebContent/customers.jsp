<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#table{
 position: relative;
      top: 100px;
      left: 75px;
       font-family: agency FB;
       width: 600px;
       border: 3px solid  #85929E;
       border-radius: 3px;
       font-size: 14px;
}
    th{
      background: #85929E;
      color: white;
      width: 150px
      height: 20px;
    }
    
    td{
    background: #ECF0F1;
    color: #85929E;
    width: 150px;
    height: 20px;
    }
</style>
</head>
<body>
<div id="table">
   <table>
      <tr>
         <th>cif</th>
         <th>customer_title</th>
         <th> customer_fname</th>
         <th> customer_lname </th>
         <th>customer_dob</th>
         <th> customer_email</th>
         <th> customer_phone</th>
         <th> customer_gender </th>
         <th>customer_address</th>
         <th> customer_zipcode</th>
         <th>customer_city </th>
         <th>customer_state  </th>
         <th>idproof_type</th>
         <th>idproofno </th>
         <th> address_type</th>
         <th> address_no </th>
      </tr>
      <c:forEach items="${clist}" var="c">
        <tr>
            <td> ${c.cif}</td>
            <td>${c. customer_title}</td>
            <td>${c.customer_fname}</td>
            <td>${c.customer_lname}</td>
            <td> ${c.customer_dob}</td>
            <td>${c.customer_email}</td>
            <td>${c.customer_phone}</td>
            <td>${c.customer_gender}</td>
            <td> ${c.customer_address}</td>
            <td>${c.customer_zipcode }</td>
            <td>${c.customer_city}</td>
            <td>${c.customer_state}</td>
            <td> ${c.idproof_type}</td>
            <td>${c.idproofno }</td>
            <td>${c.address_type}</td>
            <td>${c.address_no}</td>
			
			<td><a href="DeleteServlet?customerId=${c.cif}"><img src="delete.png" height=15 width=25 /></a>
			<td><a href="UpdateServlet?customerId=${c.cif}"><img src="update.jpg" height=15 width=25 /></a>
        </tr>
      </c:forEach>
   </table>
   </div>

</body>
</html>