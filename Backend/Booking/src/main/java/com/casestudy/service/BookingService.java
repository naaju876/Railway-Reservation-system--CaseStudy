package com.casestudy.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.controller.BookingController;
import com.casestudy.exception.TicketIdNotFoundException;
import com.casestudy.model.BookingModel;
import com.casestudy.repository.BookingRepository;

public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	Logger logger = LoggerFactory.getLogger(BookingController.class);

	public BookingModel addPassenger(BookingModel reservation) throws TicketIdNotFoundException, Exception {
		return bookingRepository.save(reservation);
	}

	public List<BookingModel> getContact() throws TicketIdNotFoundException, Exception{
    	List<BookingModel> reservation = bookingRepository.findAll();
    	System.out.println("Getting data from DB : " + reservation);
    	if (reservation.isEmpty()) {
    		throw new TicketIdNotFoundException("NO TICKETS EXISTS");
    	}
    	else
    	{
		return reservation;
    	}
		}


	public void deletePassenger(BookingModel reservation) throws TicketIdNotFoundException, Exception {
		bookingRepository.delete(reservation);

	}
}
