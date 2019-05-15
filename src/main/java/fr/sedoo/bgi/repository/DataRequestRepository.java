package fr.sedoo.bgi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.sedoo.bgi.domain.DataRequest;

public interface DataRequestRepository extends CrudRepository<DataRequest, Long> {
	
}
