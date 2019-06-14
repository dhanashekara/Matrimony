package com.matrimony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matrimony.model.UserInterest;
import com.matrimony.service.MatrimonyService;

@RestController
public class MatrimonyController {

	@Autowired
	private MatrimonyService matrimonyService;

	@PostMapping("/captureInterest")
	public String captureInterest(@RequestBody UserInterest userInterest) {
		System.out.println(" in controller");
		return 	matrimonyService.captureInterest(userInterest);		

	}

	@PutMapping("/updateInterest/{interestId}/{status}")
	public String updateInterest( @PathVariable("interestId") long id, @PathVariable("status") String status ) {

		return matrimonyService.updateInterest(id,status);

	}

	@GetMapping("/getProfiles/{city}/{gender}")
	public Object getProfiles( @PathVariable("city") String city, @PathVariable("gender") char gender ) {

		return matrimonyService.getProfiles(city,gender);
	}

}
