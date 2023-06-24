<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="/category/index" modelAttribute="item">
	<form:input path="id" placeholder="Category Id?"/>
	<form:input path="name" placeholder="Category Name?"/>
	<hr>
	<jsp:include page="_table.jsp" />
	<button class="titles1" formaction="/category/create">Create</button>
	<button class="titles1" formaction="/category/update">Update</button>
	<a class="titles1" href="/category/delete/${item.id}">Delete</a>
	<a class="titles1" href="/category/index">Reset</a>
</form:form>

