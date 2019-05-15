package fr.sedoo.bgi.service;


import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		dataRequest.setStatus(DataRequest.OPEN_STATUS);
		return dataRequestRepository.save(dataRequest);
	}
	
	@GetMapping("/list") 
	Iterable<DataRequest> list(@RequestParam(required = false, name="status") String status) {
		if (StringUtils.isEmpty(status)) {
			return dataRequestRepository.findAll();
		}
		else {
			if (status.equalsIgnoreCase(DataRequest.OPEN_STATUS)) {
				return dataRequestRepository.findByStatus(DataRequest.OPEN_STATUS);
			}
			else if (status.equalsIgnoreCase(DataRequest.CLOSED_STATUS)) {
				return dataRequestRepository.findByStatus(DataRequest.CLOSED_STATUS);
			}
			else {
				
				Response build = Response.status(Response.Status.BAD_REQUEST).entity("Incorrect parameter...").build();
				throw new WebApplicationException(build);
			}
		}
	}

}
