package com.checkIn.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.checkIn.dto.Reservation;
import com.checkIn.dto.ReservationUpdateRequest;

public interface ReservationRestFulClient {
	public Reservation findReservationId(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
