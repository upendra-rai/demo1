package com.webapp.TalentJet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="contact_us")

public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "Id", unique= true, nullable= false)
	private Long Id;
	
	@Column(name= "name", length=50, nullable= false)
	private String name;
	
	@Column(name= "email", length=50, nullable= false )
	private String email;
	
	@Column(name= "subject", length=50, nullable= false )
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name= "message", length=50, nullable= false )
	private String message;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [Id=" + Id + ", name=" + name + ", email=" + email + ", subject=" + subject +", message=" + message + "]";
	}
	
	

}
