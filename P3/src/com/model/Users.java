package com.model;

//import java.sql.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;

@Entity
public class Users extends AuditModel {

	@Id
	@GeneratedValue
	@Column(name = "_id")
	private Long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "contact_number")
	private Long contactNumber;

//	@Column(name = "regcode")
//	private String regcode;

	@Column(name = "role")
	private String role;

	@Column(name = "years_of_experience")
	private Float yearsOfExperience;

	@Column(name = "active")
	private Boolean active = false;

//	@Column(name = "confirmed_signup")
//	private Boolean confirmedSignUp = false;
//
//	@Column(name = "reset_password_date")
//	private Date resetPasswordDate;
//
//	@Column(name = "reset_password")
//	private Boolean resetPassword = false;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id")
//	private List<MentorSkills> skills = null;

	

//	@ManyToMany(targetEntity = Training.class, cascade = { CascadeType.ALL })
//	@JoinTable(name = "user_trainings", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
//			@JoinColumn(name = "training_id") })
//	private List<Training> ut;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id")
//	private List<MentorCalendar> slots = null;

	public Users(String userName, String password, String firstName, String lastName, Long contactNumber,
			String role, Float yearsOfExperience, Boolean active) {
		super();
		
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
//		this.regcode = regcode;
		this.role = role;
		
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
//		this.confirmedSignUp = confirmedSignUp;
//		this.resetPasswordDate = Date.valueOf(resetPasswordDate);
//		this.resetPassword = resetPassword;
//		this.skills = skills;
//		this.ut = ut;
//		this.slots = slots;
	}

//	public List<MentorCalendar> getSlots() {
//		return slots;
//	}
//
//	public void setSlots(List<MentorCalendar> slots) {
//		this.slots = slots;
//	}
//
//	public List<Training> getUt() {
//		return ut;
//	}
//
//	public void setUt(List<Training> ut) {
//		this.ut = ut;
//	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

//	public String getRegcode() {
//		return regcode;
//	}
//
//	public void setRegcode(String regcode) {
//		this.regcode = regcode;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Float getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

//	public Boolean getConfirmedSignUp() {
//		return confirmedSignUp;
//	}
//
//	public void setConfirmedSignUp(Boolean confirmedSignUp) {
//		this.confirmedSignUp = confirmedSignUp;
//	}
//
//	public Date getResetPasswordDate() {
//		return resetPasswordDate;
//	}
//
//	public void setResetPasswordDate(Date resetPasswordDate) {
//		this.resetPasswordDate = resetPasswordDate;
//	}
//
//	public Boolean getResetPassword() {
//		return resetPassword;
//	}
//
//	public void setResetPassword(Boolean resetPassword) {
//		this.resetPassword = resetPassword;
//	}
//
//	public List<MentorSkills> getSkills() {
//		return skills;
//	}
//
//	public void setSkills(List<MentorSkills> skills) {
//		this.skills = skills;
//	}

}
