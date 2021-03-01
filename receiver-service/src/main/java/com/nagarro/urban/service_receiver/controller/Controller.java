package com.nagarro.urban.service_receiver.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public String index() {
		return " Service Name -> receiver-service. Explanation - This service focusses on end customers and is responsible for taking the requests from users , creating an order , passes the request to admin and if the request is processed then passing the provider details as response.";
	}
	
	@GetMapping("/availableServices")
	public List<Service> availableService() {
		return Arrays.asList(new Service(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Electrician"),
				new Service(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Barber"),
				new Service(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Maids"));
	}

	class Service {
		public Service(String id, String providerId, String serviceType) {
			this.serviceId = id;
			this.providerId = providerId;
			this.serviceType = serviceType;
		}

		public String serviceId;
		public String providerId;
		public String serviceType;
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
