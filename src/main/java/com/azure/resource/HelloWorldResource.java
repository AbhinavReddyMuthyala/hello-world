package com.azure.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetings/hello")
public class HelloWorldResource {

    @GET
    public String getHello(){

        return "Hello World";
    }
}
