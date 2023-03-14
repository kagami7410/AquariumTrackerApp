package com.aquatics.aqarium_tracker;

import com.aquatics.aqarium_tracker.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AqariumTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AqariumTrackerApplication.class, args);
	}

}
