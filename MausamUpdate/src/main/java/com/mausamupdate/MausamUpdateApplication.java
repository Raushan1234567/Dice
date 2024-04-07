package com.mausamupdate;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;
@OpenAPIDefinition(info = @Info(title = "REST API", version = "1.1"),
security = {
	@SecurityRequirement(name = "basicAuth"), 
	@SecurityRequirement(name = "bearerToken")
	}, 
servers = {
	@Server(url = "/", description = "Default Server URL")
    	}
)
@SecuritySchemes({
@SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic"),
@SecurityScheme(name = "bearerToken", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
})
@SpringBootApplication
public class MausamUpdateApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MausamUpdateApplication.class, args);
	}
	
	

}
