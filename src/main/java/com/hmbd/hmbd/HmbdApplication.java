package com.hmbd.hmbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// - Initialize a new Springboot + Maven java app. ✅
// - Install the necessary dependencies. ✅
// - Create classes for:
//   - An actor - id, first name, last name, year of birth. ✅
//   - A movie - id, title, description, year, actors (yep, another one-to-many). ✅

// - Build Class methods and Springboot Controllers to achieve these endpoints:
//   - Get a movie with all its actors ✅
//   - Get a single actor ✅
//   - Create a new actor and immediately assign them to a movie. ✅
//   - Create a new movie ✅
// - Think of a way to auto-increment a new id each time we create a new movie or actor ✅
// - Populate the app with some sample data and test the API ✅
@SpringBootApplication
public class HmbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmbdApplication.class, args);

		// Movie alone = new Movie(3, "alone", "hello", 2022);

		// System.out.println(alone.getMovies());
	}

}
