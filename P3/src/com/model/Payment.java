package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment extends AuditModel{

	@Id@GeneratedValue
	@Column(name="_id")
	private Long id;
	
	@Column(name="mentor_id")
	private Long mentorId;
	
	@Column(name="mentor_name")
	private String mentorName;
	
	@Column(name="training_id")
	private Long trainingId;
	
	@Column(name="amount_paid")
	private Float amountPaid;
	
	@Column(name="amount_pending")
	private Float amountPending;

	public Payment(Long mentorId, String mentorName, Long trainingId, Float amountPaid, Float amountPending) {
		super();
	
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.trainingId = trainingId;
		this.amountPaid = amountPaid;
		this.amountPending = amountPending;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public Float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Float getAmountPending() {
		return amountPending;
	}

	public void setAmountPending(Float amountPending) {
		this.amountPending = amountPending;
	}

}
