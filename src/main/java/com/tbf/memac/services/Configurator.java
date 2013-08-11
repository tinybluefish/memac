package com.tbf.memac.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("runtime.properties")
@Configuration
public class Configurator {

	Logger LOGGER = LoggerFactory.getLogger(Configurator.class);

	@Bean DataAccessor dataAccessor() {
		return new DataAccessor();
	}
	
}
