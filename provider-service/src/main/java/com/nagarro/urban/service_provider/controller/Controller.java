package com.nagarro.urban.service_provider.controller;

import java.util.Date;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String index() {
		return "Service Name - provider-service. Explanation - This service focusses on the service providers. It is responsible for sending the notification of work to individual providers as per their area and availability.";
	}
	
	@PostMapping("/register")
	public String RegisterUser(Register register) {
		return "some token if registered successfully";
	}

	class Register {
		public String userName;
		public String emailId;
		public long phoneNumber;
		public String countryCode;
		public boolean isEmailVerified;
		public boolean isPhoneNumberVerified;
		public String encriptedPassword;
		public List<Speciality> specialities;

	}

	class Speciality {
		public String serviceProvided;
		public Date wrokingHours;
	}

	@DeleteMapping("/deleteSpeciality")
	public boolean deleteSpeciality(DeleteSpecialityRequest deleteRequest) {
		return true;
	}

	class DeleteSpecialityRequest {
		public String userName;
		public Speciality speciality;

	}

	@PostMapping("/login")
	public String login(Login login) {
		return "some token if login successfully";
	}

	class Login {
		public String userName; // can be anything username/email/phonenumber
		public String password; // need to be matched with an encrypted password
	}

	@PostMapping("/serviceRequestNotification")
	public ServiceRequest requestService(String id) {
		return new ServiceRequest();
	}

	class ServiceRequest {
		public String requestByUserId;
		public String serviceType;
		public TimeSlot timeslot;
		public Address address;
		public MapCoOrdinates coOrdinates;

	}

	class TimeSlot {
		public Date start;
		public Date end;
	}

	class Address {
		String city;
		String state;
		String country;
	}

	class MapCoOrdinates {
		public double laatitude;
		public double logitude;
	}

	@GetMapping("/acceptedOrNot")
	public String isRequestAccepted(@RequestParam("userName") String username, @RequestParam("serviceId") String serviceId,
			@RequestParam("accepted") boolean isAccepted) {
		return "accepted or declined";
	}

	@GetMapping("/clientDetails")
	public ClientInformation whoWillWork(@RequestParam("serviceId") String serviceId) {
		return new ClientInformation();
	}

	class ClientInformation {
		public String clientId;
		public String clientName;
		public Address address;
		public TimeSlot slot;
		public MapCoOrdinates coOrdinates;
	}

}
