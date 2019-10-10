package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Training extends AuditModel {

	private static final long serialVersionUID = 1L;
	@Id
	@PrimaryKeyJoinColumn
	@Column(name = "_id")
	private Long id;

	@Column(name = "status")
	private String status;

	@Column(name = "progress")
	private Integer progress;

	@Column(name = "commission_amount")
	private Float commissionAmount;

	@Column(name = "rating")
	private Integer rating = 0;

	@Column(name = "avg_rating")
	private Float avgRating = 0.0f;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private String startDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private String endDate;

	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "start_time")
	private String startTime;

	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "end_time")
	private String endTime;

	@Column(name = "amount_received")
	private Float amountReceived = 0.0f;

	@Column(name = "fees")
	private Float fees;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "mentor_id")
	private Long mentorId;

	@Column(name = "mentor_name")
	private String mentorName;

	@Column(name = "skill_id")
	private Long skillId;

	@Column(name = "skill_name")
	private String skillName;

	@OneToOne(targetEntity = Payment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id")
	private Payment payment;

	public Training(Long id, String status, Integer progress, Float commissionAmount, Integer rating, Float avgRating,
			String startDate, String endDate, String startTime, String endTime, Float amountReceived, Float fees,
			Long userId, String userName, Long mentorId, String mentorName, Long skillId, String skillName,
			Payment payment) {
		super();
		this.id = id;
		this.status = status;
		this.progress = progress;
		this.commissionAmount = commissionAmount;
		this.rating = rating;
		this.avgRating = avgRating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amountReceived = amountReceived;
		this.fees = fees;
		this.userId = userId;
		this.userName = userName;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.skillId = skillId;
		this.skillName = skillName;
		this.payment = payment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Float amountReceived) {
		this.amountReceived = amountReceived;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
