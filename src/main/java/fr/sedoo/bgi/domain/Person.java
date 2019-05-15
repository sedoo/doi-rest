package fr.sedoo.bgi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
@Table(name="People")
public class Person {

	@javax.persistence.Id
	@GeneratedValue
	private Long id;

	@Column(name="first_name", length=50)
	private String givenName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	private String familyName;

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

}
