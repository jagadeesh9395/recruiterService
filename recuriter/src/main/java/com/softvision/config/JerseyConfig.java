package com.softvision.config;


import com.softvision.controller.RecruiterController;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RecruiterController.class);
    }
}
