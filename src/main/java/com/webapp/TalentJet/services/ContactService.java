package com.webapp.TalentJet.services;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Contact;

@Service
public interface ContactService {
	
	public Contact createContact(Contact contact);

}
