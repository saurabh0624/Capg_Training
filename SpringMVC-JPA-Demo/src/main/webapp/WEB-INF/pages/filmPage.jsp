<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Film Management System</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>

</head>
<body>
<h1 align="center"> ${msg}</h1>

<hr>
<form:form action="saveFilm" method="post" commandName="film">
<table>
	<%-- <tr>
		<td>Film Id:</td>
		<td>
			<form:input path="filmId"/>
		</td>
	</tr> --%>
	<tr>
		<td>Film Name:</td>
		<td>
			<form:input path="filmName"/>
		</td>
		<td>
			<form:errors cssClass="errMsg" path="filmName"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Description:</td>
		<td>
			<form:textarea path="description"/>
		</td>
		<td>
		
		</td>
	</tr>
	<tr>
		<td>Release Date:</td>
		<td>
			<form:input path="releaseDate"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="releaseDate"></form:errors>
		</td>
	</tr>
	<tr>
		<td>Rental Cost:</td>
		<td>
			<form:input path="renetalCost"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="renetalCost"></form:errors>
		</td>
	</tr>
	<tr>
		<td>Rental Duration:</td>
		<td>
			<form:input path="rentalDuration"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="rentalDuration"></form:errors>
		</td>
	</tr>
	<tr>
		<td>Language:</td>
		<td>
			<%-- <form:input path="language"/> --%>
			
			<form:select path="language">
				<c:if test="${! empty languages }">
					<c:forEach var="lang" items="${languages}">
						<form:option value="${lang}">${lang}</form:option>
					</c:forEach>
				</c:if>
			</form:select>
			
		</td>
		<td>
		
		</td>
	</tr>
	
	<tr>
		<td>Producer EmailID:</td>
		<td>
			<form:input path="filmProducerEmail"/>
		</td>
		<td>
		<form:errors cssClass="errMsg" path="filmProducerEmail"></form:errors>
		</td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" name="Save" value="Save">
			
		</td>
		<td>
		
		</td>
	</tr>
	
</table>


</form:form>
<hr>

<table>
	<tr>
		<th>Film Id</th>
		<th>FilmName</th>
		<th>Description</th>
		<th>Release Date</th>
		<th>Rental Cost</th>
		<th>Rental Duration</th>
		<th>Language</th>
		<th>Edit</th>
		
	</tr>
	
	<c:if test="${! empty films }">
		<c:forEach var="film" items="${films}">
			<tr>
			<td>${film.filmId }</td>
			<td>${film.filmName }</td>
			<td>${film.description }</td>
			<td>${film.releaseDate }</td>
			<td>${film.renetalCost }</td>
			<td>${film.rentalDuration }</td>
			<td>${film.language }</td>
			<td>
				<a href="delete/${film.filmId}">Delete</a> 
				&nbsp;&nbsp;&nbsp;
				<a href="">Update</a>
			</td>
			</tr>
		</c:forEach>
	</c:if>

</table>

















</body>
</html>