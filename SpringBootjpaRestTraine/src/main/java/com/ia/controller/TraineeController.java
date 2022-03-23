package com.ia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Trainee;
import com.ia.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@PostMapping("/addTrainee")     //http://localhost:2323/trainee/addTrainee	
	public  Trainee addTrainee(@RequestBody Trainee tr)
	{
		return service.addTrainee(tr);
		
	}
	
	@PutMapping("/updateTrainee")     //http://localhost:2323/trainee/updateTraineee	
	public  Trainee updateTrainee(@RequestBody Trainee tr)
	{
		return service.updateTrainee(tr);
		
	}
	
	@GetMapping("/getTrainee/{tid}")     //http://localhost:1414/trainee/getTrainee/tid	
	public  Trainee getTrainee(@PathVariable("tid") int traineeId)
	{
		return service.getTrainee(traineeId);
		
	}
	
	@GetMapping("/getAllTrainee/{tid}")     //http://localhost:1414/trainee/getAllTrainee
	public  List<Trainee> getAllTrainee()
	{
		return service.getAllTrainees();	
	}
	
	@DeleteMapping("/deleteTrainee/{tid}")     //http://localhost:1414/trainee/deleteTrainee/tid	
	public  String deleteTrainee(@PathVariable("tid") int traineeId)
	{
		return service.deleteTrainee(traineeId);
		
	}

}
