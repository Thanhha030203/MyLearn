<%@ page  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<h5>User List</h5>
	<div>
		
				<tr>
			<td>${param.lists.username}</td>
				<td>${param.lists.password}</td>
				<td>${param.lists.remember?'Yes':'No'}</td>	
		</table>
	</div>
</body>
</html>