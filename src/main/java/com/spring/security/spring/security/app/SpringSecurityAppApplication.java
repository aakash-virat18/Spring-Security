package com.spring.security.spring.security.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityAppApplication implements CommandLineRunner {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userDetailsRepository.save(new AuthUser("piyush", "pass", true,
				"Admin"));
		userDetailsRepository.save(new AuthUser("abc", "1234", true,
				"User"));

	}
}
