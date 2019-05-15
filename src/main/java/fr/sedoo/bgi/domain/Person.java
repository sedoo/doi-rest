package fr.sedoo.bgi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {

	@javax.persistence.Id
	@GeneratedValue
	private Long id;

	private String givenName;
	private String familyName;

}
