package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class MentorCalendar {

	@Id
	@Column(name="_id")
	private Long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="start_time")
	@JsonFormat(pattern="HH:mm:ss")
	private String startTime;
	
	@Column(name="end_time")
	@JsonFormat(pattern="HH:mm:ss")
	private String endTime;

	public MentorCalendar(Long id, String date, String startTime, String endTime) {
		super();
		this.id = id;
		this.date = Date.valueOf(date);
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
	
}
