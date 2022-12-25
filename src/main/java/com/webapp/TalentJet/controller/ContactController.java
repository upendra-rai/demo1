package com.webapp.TalentJet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.TalentJet.entities.Contact;
import com.webapp.TalentJet.services.ContactService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5502", maxAge = 3600)
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/CreateContact")
	public Contact createContact(@RequestBody Contact contact) {
		
		return contactService.createContact(contact);
	}

}
