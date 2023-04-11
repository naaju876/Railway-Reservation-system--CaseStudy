package com.casestudy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.exception.TicketIdNotFoundException;
import com.casestudy.model.BookingModel;
import com.casestudy.repository.BookingRepository;
import com.casestudy.service.BookingService;


@SpringBootTest
class BookingApplicationTests {
	
//	@Autowired
//    private BookingService trainReservationService;
//	
//	
//    @MockBean
//    private BookingRepository reservationRepository;
//    
//    @Test
//    void getBookingTest() throws TicketIdNotFoundException, Exception {
//        when(reservationRepository.findAll())
//                       .thenReturn(Stream
//                                   .of(new BookingModel("567890","1","naaju","1234567890","naaju@gmail.com", "111", "Express","BENGALURU","VISAKHAPATNAM","20-03-2023","12.30PM", 6,600),
//                                           new BookingModel("456789","2","lahari","1234567898","lahari@gmail.com","222", "SHANTI-EXPRESS", "KARNATAKA", "chennai", "12-04-2023","10.00",7,700))
//                                     .collect(Collectors.toList()));
//                      assertEquals(2, trainReservationService.getContact().size());
//    }
//    @Test
//    void saveTrainTest() throws TicketIdNotFoundException, Exception {
//       BookingModel reservation = new BookingModel("566690", "3", "naaj","1234567890", "naaj@gmail.com", "333", "Express","BENGALURU","VISAKHAPATNAM","20-03-2023","12.30PM", 6, 600);
//    when(reservationRepository.save(reservation)).thenReturn(reservation);
//    assertEquals(reservation, trainReservationService.addPassenger(reservation));    
//    }
//@Test
// void deleteUserTest() throws TicketIdNotFoundException, Exception {
//    BookingModel reservation = new BookingModel("567890", "4", "nikki","1234567890", "naaju@gmail.com", "111", "Express","BENGALURU","VISAKHAPATNAM","20-03-2023","12.30PM", 6, 600);
//    trainReservationService.deletePassenger(reservation);
//    verify(reservationRepository, times(1)).delete((reservation));
//}

}
