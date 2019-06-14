package com.matrimony.controller;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.matrimony.model.User;
import com.matrimony.model.UserInterest;
import com.matrimony.repository.InterestRepository;
import com.matrimony.service.MatrimonyService;

@RunWith(MockitoJUnitRunner.class)
public class MatrimonyControllerTest {


	/*
	 * @Autowired private MatrimonyService matrimonyService;
	 */
	@InjectMocks
	MatrimonyService service;
	
	@Mock
	InterestRepository interestRepository;


	@Before
	public void setUp() {
		System.out.println("Unit testing setUp");
		//service = new MatrimonyService();
	}

	@Test
	public void  testCaptureInterest() {

		System.out.println("Unit testing");
		User userProfiles = new User();
		userProfiles.setId(1);

		UserInterest userInterest = new  UserInterest();
		userInterest.setInterestId(6);
		userInterest.setSourceUser("Shiva");
		userInterest.setTargetUser("rani");
		userInterest.setStatus("");
		userInterest.setTragetUserId(2);
		userInterest.setUser(userProfiles);
		
		System.out.println("before");

		
		
		Mockito.when(interestRepository.save(userInterest)).thenReturn(userInterest);
		
		String actual = service.captureInterest(userInterest);

		//String expected1 = "interest captured";
	//	String expected2 = "interest not captured please try again";
		System.out.println("actual "+actual);
		
		String expected = "interest captured";

		 assertEquals(expected,actual);
		 String expected1 = "iinterest captured";
		 assertNotEquals(expected1,actual);


	}
	
	/*
	 * @InjectMocks MatrimonyService matrimonyService;
	 * 
	 * @Mock InterestRepository interestRepository;
	 * 
	 * 
	 * InterestRepository repo;
	 * 
	 * @Test public void captureInterestTest() {
	 * 
	 * User userProfiles = new User(); userProfiles.setId(1);
	 * 
	 * UserInterest userInterest = new UserInterest();
	 * userInterest.setSourceUser("Shiva"); userInterest.setTargetUser("rani");
	 * userInterest.setStatus(""); userInterest.setTragetUserId(2);
	 * userInterest.setUser(userProfiles);
	 * 
	 * 
	 * 
	 * Mockito.when(interestRepository.save(userInterest)).thenReturn(userInterest);
	 * 
	 * String actualResult=matrimonyService.captureInterest(userInterest);
	 * Assert.assertEquals("interest captured", actualResult);
	 * 
	 * UserInterest user = interestRepository.save(userInterest);
	 * 
	 * Assert.assertEquals(userInterest, user); //
	 * Assert.assertEquals("interest captured", actualResult);
	 * 
	 * 
	 * }
	 */

}
