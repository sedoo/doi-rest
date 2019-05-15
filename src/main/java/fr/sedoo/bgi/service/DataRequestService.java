package fr.sedoo.bgi.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.sedoo.bgi.domain.Person;
import fr.sedoo.bgi.repository.PersonRepository;

@RestController
@CrossOrigin
@RequestMapping(value="/data")
public class DataRequestService {

	Logger logger = LoggerFactory.getLogger(DataRequestService.class);
	 
	@Autowired
	PersonRepository personRepository; 
	
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
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}
	
	@RequestMapping(value="/addfake", method = RequestMethod.GET)
	public void addFake() {
		Person person = new Person();
		person.setFamilyName("Doe"+UUID.randomUUID().toString());
		person.setGivenName("John");
		personRepository.save(person);
	}
	
	
	
}
