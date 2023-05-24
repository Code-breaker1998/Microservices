package com.in28minutes.microservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitservices.bean.LimitConfiguration;

@RestController
public class limitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsfromConfigurations() {
		return new LimitConfiguration(configuration.maximum,configuration.minimum);
	}
}
