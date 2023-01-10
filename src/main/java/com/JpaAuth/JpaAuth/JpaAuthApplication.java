package com.JpaAuth.JpaAuth;

import com.JpaAuth.JpaAuth.model.Post;
import com.JpaAuth.JpaAuth.repositories.PostRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaAuthApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaAuthApplication.class, args);

	}


}
