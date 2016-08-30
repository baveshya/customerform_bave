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
<th>customers registered today </th>${records}
			 <td> <input type="text" value="${records}" name="ln"></td>
				<th>customers registered session wise </th>
				<td> <input type="text" value="${records2}" name="ln"></td>
				</table> 
</body>
</html>