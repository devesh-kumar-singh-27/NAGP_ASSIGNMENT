package com.nagarro.urban.admin.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

		@GetMapping("/")
		public String index() {
			return "This gets the order details from receiver service , passes the request to the provider-service.";
		}
	
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
	public ClientDetails getClientDetials(@RequestParam("clientId") String clientId) {
		return new ClientDetails();
	}

	class ClientDetails {
		public String clientId;
		public String clientName;
		public String ServiceId;
	}

	@GetMapping("/serviceDetails")
	public ServiceDetails serviceDetails(@RequestParam("serviceId") String serviceId) {
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
	public boolean assign(@RequestParam("serviceId") String serviceId, @RequestParam("providerId") String providerDetails) {
		return true;
	}

	@GetMapping("/denied")
	public List<ServiceDetails> denedServices() {
		return Collections.emptyList();
	}

}
