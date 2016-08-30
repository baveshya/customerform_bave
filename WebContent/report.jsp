<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.entity.Customer" %>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
  function action()
  {
	  window.print();
  }
</script>
</head>
<body>
<table align="center" border="0" cellspacing="15px" bgcolor="#ADD8E6">
<tr> 
				<th>Customer id  </th>
				<td> ${customer.cif} </td>
			</tr>
			<tr>
				<th>Customer title  </th>
				<td> ${customer.customer_title}</td>
			</tr>
			<tr>
				<th>First Name  </th>
				<td>${customer.customer_fname} </td>
			</tr>
			<tr>
				<th>Last Name  </th>
				<td> ${customer.customer_lname}</td>
			</tr>
			<tr> 
				<th>date of birth </th>
				<td> ${customer.customer_dob}</td>
			</tr>
			<tr> 
				<th>Email: </th>
				<td> ${customer.customer_email}</td>
			</tr>
			<tr> 
				<th>Phone Number </th>
				<td> ${customer.customer_phone}</td>
			</tr>
			<tr> 
			<tr> 
				<th>Gender  </th>
				<td> ${customer.customer_gender}
					 
				</td>
				
			<tr> 
				<th>Address</th>
				<td>${customer.customer_address} </td>
			</tr>
			<tr> 
				<th>Zipcode </th>
				<td> ${customer.customer_zipcode}</td>
			</tr>
			<tr> 
				<th>City  </th>
				<td> 
					${customer.customer_city}
				</td>
			</tr>
			<tr> 
				<th>State  </th>
				<td> ${customer.customer_state}
					
				</td>
			</tr>
			<tr> 
				<th>Idproof_type  </th>
				<td> 
					${customer.idproof_type}
				</td>
			</tr>
			<tr> 
				<th>Id proof number
				
				
				 </th>
				<td> ${customer.idproofno}</td>
			<tr> 
			
			
			
				<th>Address proof type  </th>
				<td> 
					${customer.address_type}
				</td>
			</tr>
			<tr> 
				<th>Address proof number </th>
				<td>${customer.address_no}</td>
			</tr>
       <tr>
        <td colspan="2"><center>
         <button onclick="action()">print</button></center>
         </td>
       </tr>
			
			
				
			

</table>
<%@include file="Footer.jsp"%>
</body>
</html>