package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MentorSkills {

	@Id
	@GeneratedValue
	@Column(name = "skill_id")
	private Long id;

	@Column(name = "skill_name")
	private String name;

	@Column(name = "toc")
	private String toc;

	@Column(name = "prerequisites")
	private String prerequisites;
	
	@Column(name="mentor_id")
	private Long mentorId;

	public MentorSkills() {
	}

	public MentorSkills(String name, String toc, String prerequisites,Long mentorId) {
		super();
	
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
		this.mentorId = mentorId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

}
