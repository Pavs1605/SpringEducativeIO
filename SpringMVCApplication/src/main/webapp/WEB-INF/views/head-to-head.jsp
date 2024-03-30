<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Head-to-Head</title>

<style>
.error {
	color:red;
	position: fixed;
}
</style>

</head>
<body>
<h2>Head-to-Head Statistics</h2>
	<hr>
	<form:form action = "processStatsForm" modelAttribute="playerStats">

		<br><br>
		Player 1: <form:input path = "player1"/> &emsp; vs. &emsp;

		Player 2: <form:input path = "player2"/>

	    <br><br>
	    Head-to-Head *:  <form:input path = "head2head" placeholder="##-##"/> &emsp;
	    <form:errors path= "head2head" cssClass="error"/>

	    <br><br>
		<input type ="submit" value = "Submit"/>

	</form:form>

</body>
</html>