package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class JobDto {

	private long id;

	@Column(name="job_title", length=50, nullable= false)
	private String jobTitle; 
	
	private String jobType; 
	
	private String jobDiscription; 
	
	private String email; 
	
	private String mobileNumber; 
	
	private String address; 
	
	private String location; 
	
	private String educationQualification; 
	
	private String salary; 
	
	private String jobPostingDate;
	
	private String applicationLastDate;

	private Long recruiterId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobDiscription() {
		return jobDiscription;
	}

	public void setJobDiscription(String jobDiscription) {
		this.jobDiscription = jobDiscription;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getJobPostingDate() {
		return jobPostingDate;
	}

	public void setJobPostingDate(String jobPostingDate) {
		this.jobPostingDate = jobPostingDate;
	}

	public String getApplicationLastDate() {
		return applicationLastDate;
	}

	public void setApplicationLastDate(String applicationLastDate) {
		this.applicationLastDate = applicationLastDate;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

	@Override
	public String toString() {
		return "JobDto [id=" + id + ", jobTitle=" + jobTitle + ", jobType=" + jobType + ", jobDiscription="
				+ jobDiscription + ", email=" + email + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", location=" + location + ", educationQualification=" + educationQualification + ", salary=" + salary
				+ ", jobPostingDate=" + jobPostingDate + ", applicationLastDate=" + applicationLastDate
				+ ", recruiterId=" + recruiterId + "]";
	}

	

}
