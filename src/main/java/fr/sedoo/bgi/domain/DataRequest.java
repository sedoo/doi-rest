package fr.sedoo.bgi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity

public class DataRequest {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getiSource() {
		return iSource;
	}

	public void setiSource(Integer iSource) {
		this.iSource = iSource;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	@javax.persistence.Id
	@GeneratedValue
	private Long id;

	private Integer iSource;
	
	private String institution;

}
