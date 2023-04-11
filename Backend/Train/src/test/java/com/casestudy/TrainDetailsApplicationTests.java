package com.casestudy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.controller.TrainController;

import com.casestudy.model.TrainModel;
import com.casestudy.repository.TrainRepository;
import com.casestudy.service.TrainService;

@SpringBootTest
class TrainDetailsApplicationTests {

	private static final String Main = null;

	@Autowired
	private TrainService trainService;
	
	@Autowired
	private TrainController traincontroller;
	
	@MockBean
	private TrainRepository trainrepository;
	
	@Test
	 void getTrainTest()  {
		when(trainrepository.findAll())
		       .thenReturn(Stream
		                 .of(new TrainModel("567", "AMT EXPRESS",  "Badnera", "Amravati", 100, 87, "10.00PM"),
				           new TrainModel("2", "NGP EXPRESS",  "PUNE", "Nagpur", 500, 89, "12.00PM"))
		                   .collect(Collectors.toList()));
assertEquals(2, trainService.getContact().size());
}
	
	@Test
	 void saveTrainTest() {
		TrainModel train = new TrainModel("786", " EXPRESS", "HYDRABAD", "NAGPUR", 500, 67, "12.30PM");
		when(trainrepository.save(train)).thenReturn(train);
		assertEquals(train, trainService.addTrain(train));

	}
	@Test
	 void deleteUserTest() {
		TrainModel train = new TrainModel("896", "AMT EXPRESS",  "Badnera", "Amravati", 100, 89, "11.30PM");
		trainService.deleteTrain(train);
		verify(trainrepository, times(1)).delete(train);
	}
	
	@Test
	 void UpdateTrain() {
		TrainModel train = new TrainModel("6", "Express",  "Hyderabad", "Nagpur", 200, 78, "10.00PM");
		trainService.updateTrain(train);
		verify(trainrepository, times(1)).save(train);
	}
	
	
	@Test
	void getTrainByIdTest(){
	    String id = "2";
		TrainModel train = traincontroller.getTrains(id);
		if(null != train) {
		    verify(trainrepository).findById(train.getTrainNo());
		}
	
	}
}


