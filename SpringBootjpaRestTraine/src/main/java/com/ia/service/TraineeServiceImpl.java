package com.ia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.Traineedao;
import com.ia.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	Traineedao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return dao.updateTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int traineeId) {
		return dao.deleteTrainee(traineeId);
	}

	@Override
	public Trainee getTrainee(int traineeId) {
		return dao.getTrainee(traineeId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return dao.getAllTrainees();
	}

}
