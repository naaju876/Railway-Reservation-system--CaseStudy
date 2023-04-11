package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Traindata")
public class TrainModel {
	
	@Id
	public String trainNo;
	public String trainName;
	public String trainFrom;
	public String trainTo;
	public int fare;
	public int seats;
	public String time;
	
	
		

}
