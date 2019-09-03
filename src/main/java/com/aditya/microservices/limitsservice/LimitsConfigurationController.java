package com.aditya.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	Configuration config;

	@GetMapping(path = "/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {

		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}

}
