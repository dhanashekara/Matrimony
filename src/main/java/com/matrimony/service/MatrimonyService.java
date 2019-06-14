package com.matrimony.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimony.model.User;
import com.matrimony.model.UserInterest;
import com.matrimony.repository.InterestRepository;
import com.matrimony.repository.UserRepository;

import antlr.collections.List;

@Service
public class MatrimonyService {

	@Autowired
	private InterestRepository repo;
	
	@Autowired
	private UserRepository userRepo;

	public String captureInterest(UserInterest interest) {

		System.out.println("in service");
		if (repo.save(interest) != null)
			return "interest captured";
		else
			return "interest not captured please try again";

	}
	
	public String updateInterest(long id,String status ) {
		
		UserInterest interest =repo.findById(id).get();
	
		
		interest.setStatus(status);
		if(repo.save(interest)!=null)
			return "Request Accepted";
		else
			return "Please try later";
	}
	
	public Object getProfiles(String city,char gender){
		
		ArrayList<User> usersList = new ArrayList<>();
		 usersList = userRepo.findByCityAndGender(city,gender);
		 
		
		if(usersList != null && !usersList.isEmpty())
			return usersList;
		else
			return "Profiles not found";
		
	}

}
