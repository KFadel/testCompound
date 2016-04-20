/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntg.resteasyWS;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ntg.pojo.*;
import com.ntg.controller.*;
/**
 *
 * @author AndDeve
 */
// http://localhost:8080/resteasyWS/resteasy/country/getCountry
// 

@Path("/country")
public class CountryWS {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
//    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//         
//         UserControllerInter userControllerInter = (UserControllerInter) context.getBean("userControllerImple");
//         User user = new User();
//         user.setUsername("Mohamed");
//         user.setAddress("Alexandria");
//         user.setFname("wagdi");
//         user.setLname("ahmed");
//
//         userControllerInter.insertUser(user);
        return "Hello World";    
    }
	
    // This method is called if XMLis request
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Country getXML() {
        Country c = new Country();
        c.setId(1);
        c.setName("England");
        return c;
    }

    // This method is called if XMLis request
    @GET
    @Path("/getCountry")
    @Produces(MediaType.APPLICATION_JSON)
    public Country getJSON() {
        Country c = new Country();
        c.setId(2);
        c.setName("Spain");
        return c;
    }

    
    // This can be used to test the integration with the browser
    @GET
    @Produces({MediaType.TEXT_XML})
    public Country getHTML() {
        Country c = new Country();
        c.setId(2);
        c.setName("Brazil");
        return c;
    }

    // This method is called if XMLis request
    @Consumes(MediaType.APPLICATION_JSON)

    @GET
    @Path("/send")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response SetXML(Country newCountry) {
        System.out.println("country Name : " + newCountry.getName());
        newCountry.setId(1);
        newCountry.setName("Update : England");
        
        String output = newCountry.toString();
        return Response.status(200).entity(output).build();
    }

}
