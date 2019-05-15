package fr.sedoo.bgi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity

public class DataRequest {
	
	public final static String OPEN_STATUS = "open";
	public final static String CLOSED_STATUS = "CLOSED";

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@javax.persistence.Id
	@GeneratedValue
	private Long id;

	private Integer iSource;
	
	private String institution;
	
	private String status;

}
