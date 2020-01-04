<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
	<table>
		<tr>
			<td>Id :</td>
			<td>${employee.employeeId}</td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><input type="text" name="txtName" value="${employee.employeeName}"></td>
		</tr>
				<tr>
				<th>Gender:</th>
				<td>Male<input type="radio" name="gender" value="Male" <c:if test="${ employee.gender.eq 'Male'}"> checked="checked"</c:if>>
					 Female<input type="radio" name="gender" value="Female" <c:if test="${ employee.gender.eq 'Female'}"> checked="checked"</c:if>></td>
			
			</tr> 
	</table>
	<br>
	
</body>
</html>