package com.webapp.TalentJet.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "applicantId", unique = true, nullable = false)
	private long applicantId;

	private String fullName;

	private String userName;

	private String email;

	private String mobileNumber;

	private String profilePic;

	private String resume;

	private String location;

	private String experiance;

	private String industry;

	private String userSkills;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "recruiter_id")
	private Recruiter recruiter;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "jobs_id")
	private Jobs jobs;

	public long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(long applicantId) {
		this.applicantId = applicantId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExperiance() {
		return experiance;
	}

	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(String userSkills) {
		this.userSkills = userSkills;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public Recruiter getRecruiter() {
		return recruiter;
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public Applicant(long applicantId, String fullName, String userName, String email, String mobileNumber,
			String profilePic, String resume, String location, String experiance, String industry, String userSkills,
			Jobseeker jobseeker, Recruiter recruiter, Jobs jobs) {
		super();
		this.applicantId = applicantId;
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.profilePic = profilePic;
		this.resume = resume;
		this.location = location;
		this.experiance = experiance;
		this.industry = industry;
		this.userSkills = userSkills;
		this.jobseeker = jobseeker;
		this.recruiter = recruiter;
		this.jobs = jobs;
	}

	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", fullName=" + fullName + ", userName=" + userName
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", profilePic=" + profilePic + ", resume="
				+ resume + ", location=" + location + ", experiance=" + experiance + ", industry=" + industry
				+ ", userSkills=" + userSkills + ", jobseeker=" + jobseeker + ", recruiter=" + recruiter + ", jobs="
				+ jobs + "]";
	}
	
	

}
