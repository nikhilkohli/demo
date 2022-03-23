package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Trainee;

@Repository
public class TraineedaoImpl implements Traineedao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTraineeId());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return entity.merge(trainee);
	}

	@Override
	public String deleteTrainee(int traineeId) {
		 Trainee tr = entity.find(Trainee.class, traineeId);
			if(tr!=null)
			{
				entity.remove(tr);
				return "Trainee Deleted";
			}
			else
			{
				return "No Trainee Found";
			}
	}

	@Override
	public Trainee getTrainee(int traineeId) {
		// TODO Auto-generated method stub
		return entity.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		TypedQuery<Trainee> result = entity.createQuery("select * from Trainee t",Trainee.class);
		return result.getResultList();
	}

}
