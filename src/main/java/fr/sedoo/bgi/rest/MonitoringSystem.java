package fr.sedoo.bgi.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MonitoringSystem {

	@Autowired
	private Mail mail;
	
	@PostConstruct
	public void sendMail() {
		mail.envoyer();
	}
	
}
