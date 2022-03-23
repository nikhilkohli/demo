package com.ia.service;

import java.util.List;

import com.ia.entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee trainee);
	
	Trainee updateTrainee(Trainee trainee);
	
	String deleteTrainee(int traineeId);
	
	Trainee getTrainee(int traineeId);
	
	List<Trainee> getAllTrainees();

}
