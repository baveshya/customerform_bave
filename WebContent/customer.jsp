<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="image.jpg" >
<% 
long i= Math.round(Math.random()*75); 

%> 

<p style="font-family:Georgia;text-align:center;font-size:25px;font-weight:bold;color:white">Customer Information </p>
<form action="RegisterServlet" method="post" >
<table align="center" border="0" cellspacing="15px" bgcolor="#ADD8E6">
<tr> 
				<th>Customer id  </th>
				<td> <input type="text" name="cif"></td>
			</tr>
			<tr>
				<th>Customer title  </th>
				<td> <input type="text" name="ct"></td>
			</tr>
			<tr>
				<th>First Name  </th>
				<td> <input type="text" name="fn"></td>
			</tr>
			<tr>
				<th>Last Name  </th>
				<td> <input type="text" name="ln"></td>
			</tr>
			<tr> 
				<th>date of birth </th>
				<td> <input type="text" name="dob"></td>
			</tr>
			<tr> 
				<th>Email: </th>
				<td> <input type="text" name="em"></td>
			</tr>
			<tr> 
				<th>Phone Number </th>
				<td> <input type="text" name="pn"></td>
			</tr>
			<tr> 
			<tr> 
				<th>Gender  </th>
				<td> 
					<input type="radio" name="gender" value="male" > Male<br>
					<input type="radio" name="gender" value="female"> Female<br>
				</td>
				
			<tr> 
				<th>Address</th>
				<td> <input type="text" name="ad"></td>
			</tr>
			<tr> 
				<th>Zipcode </th>
				<td> <input type="text" name="zp"></td>
			</tr>
			<tr> 
				<th>City  </th>
				<td> 
					<select name="city">
						<option value="ch"> Chennai</option>
						<option value="ba">Bangalore</option>
						<option value="mu">Mumbai</option>
						<option value="gurg">Gurgaon</option>
						<option value="go">Goa</option>
						<option value="hyd">Hyderabad</option>
					</select>
				</td>
			</tr>
			<tr> 
				<th>State  </th>
				<td> 
					<select name="state">
						<option value="tn"> Tamil Nadu</option>
						<option value="ap">Andhra Pradesh</option>
						<option value="kl">Kerala</option>
						<option value="kan">Karnataka</option>
						<option value="mah">Maharashtra</option>
						<option value="or">Orissa</option>
					</select>
				</td>
			</tr>
			<tr> 
				<th>Idproof_type  </th>
				<td> 
					<select name="idp">
						<option value="pass"> Passport</option>
						<option value="adh">Adhaar card</option>
						<option value="driv">Driving license</option>
						<option value="ratio">Ration card</option>
						<option value="elbi">Electic bill</option>
					
					</select>
				</td>
			</tr>
			<tr> 
				<th>Id proof number </th>
				<td> <input type="text" name="id"></td>
			</tr>
			<tr> 
				<th>Address proof type  </th>
				<td> 
					<select name="adp">
						<option value="pass"> Passport</option>
						<option value="adh">Adhaar card</option>
						<option value="driv">Driving license</option>
						<option value="ratio">Ration card</option>
						<option value="elbi">Electic bill</option>
					
					</select>
				</td>
			</tr>
			<tr> 
				<th>Address proof number </th>
				<td> <input type="text" name="adn"></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit" name="sb"></td></tr>
			
			
				
			

</table>
</form>
<%@include file="Footer.jsp"%>
</body>
</html>