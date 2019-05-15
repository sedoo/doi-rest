package fr.sedoo.bgi.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value="/data")
public class DataRequestService {

	Logger logger = LoggerFactory.getLogger(DataRequestService.class);
	 
	
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping(value="/isalive", method = RequestMethod.GET)
	public String isAlive() {
		logger.info("On m'a appelé");
		return "yes - port "+port;
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public Person getAdmin() {
		Person result = new Person();
		result.setFamilyName("Stapel");
		result.setGivenName("Hanna");
		return result;
	}
	
	
}
