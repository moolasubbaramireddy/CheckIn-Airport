package com.checkIn.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.checkIn.dto.Reservation;
import com.checkIn.dto.ReservationUpdateRequest;

@Component
public class ReservationRestFulClientImpl implements ReservationRestFulClient {

	@Override
	public Reservation findReservationId(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/" + id,
				Reservation.class);

		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation/", request, Reservation.class);
		return reservation;
	}

}
