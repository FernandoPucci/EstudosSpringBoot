package com.teste.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@Path("/api")	
public class RestServicesControllers {

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String testService(){
		
		return "Sucesso!";
		
	}
	
	
}
