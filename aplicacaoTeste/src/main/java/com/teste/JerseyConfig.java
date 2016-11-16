package com.teste;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.teste.ws.RestServicesControllers;


/**
 * @author fernandopucci
 *
 * Classe de configuração dos serviços REST
 *
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(RestServicesControllers.class);

	}

}
