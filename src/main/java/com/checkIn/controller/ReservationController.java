package com.checkIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.checkIn.dto.Reservation;
import com.checkIn.dto.ReservationUpdateRequest;
import com.checkIn.integration.ReservationRestFulClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestFulClient restClient;
	
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";  
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservationId(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/prosscedToCheckIn")
	public String updateReservation(@RequestParam("id") long id, @RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest reservationUpdateRequest=new  ReservationUpdateRequest();
		reservationUpdateRequest.setId(id);
		reservationUpdateRequest.setCheckInStatus(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateRequest);
		return"confirmReservation";
	}
}
