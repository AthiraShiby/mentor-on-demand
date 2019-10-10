package com.model;

import java.sql.Date;

@SuppressWarnings("unused")
public class UserDtls {

	private Long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private Long contactNumber;
	private String regcode;
	private String role;
	private String linkedinUrl;
	private Float yearsOfExperience;
	private Boolean active = false;
	private Boolean confirmedSignUp = false;
	private Date resetPasswordDate;
	private Boolean resetPassword = false;
}
