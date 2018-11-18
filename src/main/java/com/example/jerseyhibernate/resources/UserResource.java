package com.example.jerseyhibernate.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.jerseyhibernate.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jerseyhibernate.model.User;

@Component
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GET
    public Response fetchUsers(){
        return Response.status(200).entity(userRepository.findAll()).build(); 
    }

    @POST
    public Response addUser(User user){
        userRepository.save(user);
        return Response.status(200).build();

    }

}
