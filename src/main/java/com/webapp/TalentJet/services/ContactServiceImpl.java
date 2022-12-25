package com.webapp.TalentJet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Contact;
import com.webapp.TalentJet.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public Contact createContact(Contact contact) {
		
		return contactRepository.save(contact) ;
	}

}
