<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<table class="table table-bordered">
	<tr>
		<th class="text-center titles">ID</th>
		<th class="text-center titles">Name</th>
		<th></th>
	</tr>
	<c:forEach var="item" items="${items}">
		<tr class="text-light">
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td class="text-center"><a href="/category/edit/${item.id}">EDIT</a></td>
		</tr>
	</c:forEach> 
</table>