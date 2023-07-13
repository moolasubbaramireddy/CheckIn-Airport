<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REservations Details</title>   
</head>
<body>
	<h2>Reservation Details</h2>
	Passenger Name: ${reservation. getPassenger().firstName}
	<br> PassengerEmail: ${reservation.getPassenger().email} Passenger
	phone:
	<br> ${reservation.getPassenger().phone} Operating AirLine:
	<br> ${reservation.getFlight().operatingAirlines } flightNumber :
	<br> ${reservation.getFlight().flightNumber } Departure City:
	<br> ${reservation.getFlight().departureCity } Arrival City
	<br> :${reservation.getFlight().departureCity } DateOfDeparture
	<br> :${reservation.getFlight().dateOfDeparture }
	<br>

	<h2>Update No OF Bags & Status</h2>
	<form action="prosscedToCheckIn" method="post">
		<pre>
			Reservation Id	<input type="text" name="id" value="${reservation.id}" /> 
			Number Of Bags:	<input type="text" name="numberOfBags" />
			<input type="submit" value="Confirm" />

		</pre>


	</form>




</body>
</html>