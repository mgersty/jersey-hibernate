package com.example.jerseyhibernate.config;
 
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

import com.example.jerseyhibernate.resources.*;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(UserResource.class);
    }
}