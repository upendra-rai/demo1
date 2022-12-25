package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="jobs")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "jobId", unique= true, nullable= false )
	private long jobId;
	
	@Column(name="job_title", length=50, nullable= false)
	private String jobTitle; 
	
	@Column(name="job_type", length=50, nullable= false)
	private String jobType; 
	
	@Column(name="job_discription", length=255, nullable= false)
	private String jobDiscription; 
	
	@Column(name="job_email", length=50, nullable= false)
	private String email; 
	
	@Column(name="job_mobileNo.", length=50, nullable= false)
	private String mobileNumber; 
	
	@Column(name="job_address", length=255, nullable= false)
	private String address; 
	
	@Column(name="job_location", length=50, nullable= false)
	private String location; 
	
	@Column(name="job_educationQualification", length=50, nullable= false)
	private String educationQualification; 
	
	@Column(name="job_salary", length=50, nullable= false)
	private String salary; 
	
	@Column(name= "job_posting_date", length=50, nullable= false)
	private String jobPostingDate;
	
	@Column(name= "application_last_date", length=50, nullable= false)
	private String applicationLastDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "recruiter_id", nullable = false)
	private Recruiter recruiter;

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
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

	public Recruiter getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobType=" + jobType + ", jobDiscription="
				+ jobDiscription + ", email=" + email + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", location=" + location + ", educationQualification=" + educationQualification + ", salary=" + salary
				+ ", jobPostingDate=" + jobPostingDate + ", applicationLastDate=" + applicationLastDate + ", recruiter="
				+ recruiter + "]";
	}


}
