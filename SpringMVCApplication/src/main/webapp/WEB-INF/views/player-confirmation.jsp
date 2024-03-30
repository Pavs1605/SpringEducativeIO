<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Player Confirmation</title>
</head>
<body>
	<h2>Player Confirmation</h2>
	<hr>

	<br><br>
	The player has been added.

<br><br>
	<b>Name</b> : ${athlete.firstName} ${athlete.lastName}
     <br>
     Rank :  ${athlete.rank}
	<br><br>
    <b>Country</b> : ${athlete.country}

    <br><br>
        <b>Prize Money</b> : ${athlete.prizeMoney}

      <br><br>
      <b> Last won </b> : <fmt:formatDate value="${athlete.lastWon}" type="date" pattern="dd-MM-YYYY" />
	<br><br>
    <b>Handedness</b> : ${athlete.handedness}

    <br><br>
    <b>Grand Slam Titles</b> :
    <ul>
		<c:forEach items="${athlete.grandSlams}" var="grandSlam">
			<li>${grandSlam}</li>
		</c:forEach>
	</ul>

</body>
</html>