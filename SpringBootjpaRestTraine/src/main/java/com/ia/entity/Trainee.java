package com.ia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainee")
public class Trainee {
	
	@Id
	@Column(name = "tid", length = 10)
	private int traineeId;
	@Column(name = "tname", length = 15)
	private String traineeName;
	@Column(name = "tsal", length = 10)
	private int traineeSal;
	@Column(name = "tadd", length = 15)
	private String traineeAdd;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getTraineeSal() {
		return traineeSal;
	}
	public void setTraineeSal(int traineeSal) {
		this.traineeSal = traineeSal;
	}
	public String getTraineeAdd() {
		return traineeAdd;
	}
	public void setTraineeAdd(String traineeAdd) {
		this.traineeAdd = traineeAdd;
	}
	public Trainee(int traineeId, String traineeName, int traineeSal, String traineeAdd) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeSal = traineeSal;
		this.traineeAdd = traineeAdd;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeSal=" + traineeSal
				+ ", traineeAdd=" + traineeAdd + "]";
	}
	
	
	

}
