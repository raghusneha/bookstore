package com.sneha.bookstore;

import com.sneha.bookstore.profile.Profile;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookstoreApplication {
	@Autowired
	private Profile messageComponent;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@PostConstruct
	public void init() {
		String message = messageComponent.getMessage();
		System.out.println("Message: " + message);
	}
}
