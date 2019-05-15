package fr.sedoo.bgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sedoo.bgi.domain.DataRequest;
import fr.sedoo.bgi.repository.DataRequestRepository;

@RestController
@CrossOrigin
@RequestMapping(value="/datarequest")
public class DataRequestService {

	@Autowired
	DataRequestRepository dataRequestRepository;
	
	@PostMapping("/add")
	DataRequest addDataRequest(@RequestBody DataRequest dataRequest) {
		return dataRequestRepository.save(dataRequest);
	}
	
	@GetMapping("/list") 
	Iterable<DataRequest> list() {
		return dataRequestRepository.findAll();
	}

}
