package com.nagarro.urban.service_receiver.controller;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/availableServices")
	public String helloWorld() {
		return "available services";
	}

	class Service {
		public String serviceId;
		public String providerId;
		public String customerId;
	}

	@GetMapping("/clientDetails")
	public ClientDetails getClientDetials(@QueryParam("clientId") String clientId) {
		return new ClientDetails();
	}

	class ClientDetails {
		public String clientId;
		public String clientName;
		public String ServiceId;
	}

	@GetMapping("/serviceDetails")
	public ServiceDetails serviceDetails(@QueryParam("serviceId") String serviceId) {
		return new ServiceDetails();
	}

	class ServiceDetails {
		public String serviceType;
		public String serviceLocation;
		public boolean isAccepted;
	}

	public ProviderDetails providerDetails() {
		return new ProviderDetails();
	}

	class ProviderDetails {
		public String proviederId;
		public List<String> servicesProvided;
		public List<Location> servedLocations;
		public List<ServiceDetails> serviceInPipeline;
	}

	class Location {

	}

	@PutMapping("/assign")
	public boolean assign(@QueryParam("serviceId") String serviceId, @QueryParam("providerId") String providerDetails) {
		return true;
	}

	@GetMapping("/denied")
	public List<ServiceDetails> denedServices() {
		return Collections.emptyList();
	}

}
