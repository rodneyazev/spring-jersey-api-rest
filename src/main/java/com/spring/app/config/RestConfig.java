package com.spring.app.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.spring.app.resource.EmpresaResource;

@Component
public class RestConfig extends ResourceConfig {
	
	public RestConfig(Class<?>... classes) {
		register(EmpresaResource.class);
	}

}
