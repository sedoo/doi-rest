package fr.sedoo.bgi.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.sedoo.bgi.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("mysql")
public class PersonRepositoryTest {

	@Autowired
	PersonRepository personRepository;
	
	@Test
	public void simpleTest() {
		
		Assert.assertEquals("The repo must be empty",personRepository.count(), 0);
		
		Person john = new Person();
		john.setFamilyName("Lennon");
		john.setGivenName("john");
		
		personRepository.save(john);
		
		Assert.assertEquals("The repo must contain one person",personRepository.count(), 1);
		
		Person loadedJohn = personRepository.findOne(john.getId());
		Assert.assertEquals("Lennon", loadedJohn.getFamilyName());
		
	}
	
}
