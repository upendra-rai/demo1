package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobseeker")
public class Jobseeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "jobseekerId", unique= true, nullable= false)
	private Long jobseekerID;
	
	@Column(name= "email", length=50, nullable= false )
	private String email;
	
	@Column(name="password", length=50, nullable=false)
	private String password;
	
	@Column(name= "user_name", length=50, nullable= false)
	private String userName;
	
	@Column(name= "full_name", length=50, nullable= false)
	private String fullName;
	
	@Column(name= "dob", length=50, nullable= false)
	private String dateOfBirth;
	
	@Column(name= "gender", length=50, nullable= false)
	private String gender;
	
	@Column(name= "current_salary", length=50, nullable= false)
	private String currentSalary;
	
	@Column(name= "total_experince", length=255, nullable= false)
	private Integer totalExperince;
	
	@Column(name= "skill_set", length=255, nullable= false)
	private String skillSet;
	
	@Column(name= "current_address", length=255, nullable= false)
	private String currentAddress;
	
	@Column(name= "location", length=50, nullable= false)
	private String location ;
	
	@Column(name= "introduction", length=255, nullable= false)
	private String introduction;
	
	@Column(name= "resume", length=50, nullable= false)
	private String resume;

	public Long getJobseekerID() {
		return jobseekerID;
	}

	public void setJobseekerID(Long jobseekerID) {
		this.jobseekerID = jobseekerID;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(String currentSalary) {
		this.currentSalary = currentSalary;
	}

	public Integer getTotalExperince() {
		return totalExperince;
	}

	public void setTotalExperince(Integer totalExperince) {
		this.totalExperince = totalExperince;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Jobseeker [jobseekerID=" + jobseekerID + ", email=" + email + ", password=" + password + ", userName="
				+ userName + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", currentSalary=" + currentSalary + ", totalExperince=" + totalExperince + ", skillSet=" + skillSet
				+ ", currentAddress=" + currentAddress + ", location=" + location + ", introduction=" + introduction
				+ ", resume=" + resume + "]";
	}
	
	
	
}
