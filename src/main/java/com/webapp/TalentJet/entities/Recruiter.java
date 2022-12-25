package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruiters")
public class Recruiter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "recruiterId", unique= true, nullable= false)
	private Long recruiterID;
	
	@Column(name= "employer_companyName", length=50, nullable= false)
	private String employerCompanyName;
	
	@Column(name= "recruiter_name", length=50, nullable= false)
	private String recruiterName;
	
	@Column(name= "email", length=50, nullable= false )
	private String email;
	
	@Column(name= "userName", length=50, nullable= false )
	private String userName;
	
	@Column(name="password", length=255, nullable=false)
	private String password;
	
	@Column(name= "contact_number", length=50)
	private String contactNumber;
	
	@Column(name= "company_address", length=50, nullable= false)
	private String currentAddress;
	
	@Column(name= "location", length=50, nullable= false)
	private String location ;
	
	@Column(name= "about_Company", length=255, nullable= false)
	private String aboutCompany;

	public Long getRecruiterID() {
		return recruiterID;
	}

	public void setRecruiterID(Long recruiterID) {
		this.recruiterID = recruiterID;
	}

	public String getEmployerCompanyName() {
		return employerCompanyName;
	}

	public void setEmployerCompanyName(String employerCompanyName) {
		this.employerCompanyName = employerCompanyName;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	@Override
	public String toString() {
		return "Recruiter [recruiterID=" + recruiterID + ", employerCompanyName=" + employerCompanyName
				+ ", recruiterName=" + recruiterName + ", email=" + email + ", userName=" + userName + ", password="
				+ password + ", contactNumber=" + contactNumber + ", currentAddress=" + currentAddress + ", location="
				+ location + ", aboutCompany=" + aboutCompany + "]";
	}
	
	


}
