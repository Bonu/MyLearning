package com.apptest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloworldService {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public helloworld getMsg(@PathParam("param") String msg){
//		return Response.status(200).entity(new helloworld("TheMessage")).build();
		return new helloworld("Hello");
	}
	
}