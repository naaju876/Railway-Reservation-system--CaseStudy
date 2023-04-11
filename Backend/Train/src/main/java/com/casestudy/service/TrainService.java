package com.casestudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.exception.TrainIdNotFoundException;
import com.casestudy.model.TrainModel;
import com.casestudy.repository.TrainRepository;

public class TrainService {
	

	@Autowired
	private TrainRepository trainRepository;

	
	
	public TrainModel addTrain (TrainModel train) {
		return trainRepository.save(train);
		
	}
	
	public List<TrainModel> getContact(){
		List<TrainModel> train = trainRepository.findAll();
		System.out.println("Getting data from DB:" +train);
		return train;
	}
	
	
	public TrainModel getTrainbyId(String id)throws TrainIdNotFoundException{
		 TrainModel model = trainRepository.findByTrainNo(id);
		 if(model!=null) {
			 return model;
		 }else {
			 throw new TrainIdNotFoundException();
		 }
//				.orElseThrow(()->new TrainIdNotFoundException("Id:"+id+"Not found"));
	}
	
	public void deleteTrain(TrainModel train) {
		trainRepository.delete(train);
	}
	
	public TrainModel updateTrain(TrainModel train) {
		return trainRepository.save(train);
	}
	

}
