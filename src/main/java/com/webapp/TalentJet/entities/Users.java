package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "userId", unique= true, nullable= false)
	private Long userID;
	
	@Column(name= "user_name", length=50, nullable= false)
	private String userName;
	
	@Column(name= "email", length=50, nullable= false )
	private String email;
	
	@Column(name= "mobie_number", length=50)
	private String mobileNumber;
	
	@Column(name="password", length=255, nullable=false)
	private String password;
	
	@Column(name= "token", length= 200)
	private String token;
	
	@Column(name="roles", nullable=false)
	private Roles roles;
	
	public enum Roles{
		Admin,Jobseeker,Recruiter;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", password=" + password + ", token=" + token + ", roles=" + roles + "]";
	}
	
	
	

}
