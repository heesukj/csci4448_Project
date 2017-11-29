
package com.stockscore.stockscore_new;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* This class file really is the heart of a Spring Boot application.
Not only will this contain any static configuration that we need to build,
but you will see that it's been annotated here with the Spring Boot Application annotation.
And what that annotation does, is it not only does all of our autoconfig and all our of components scanning.
But it really sets up all of the things that make the rapid application development possible.
So in this case, what we can actually do is we can actually run this application and indeed it will run.*/


@SpringBootApplication
public class StockscoreNewApplication {

	public static void main(String[] args) {

		SpringApplication.run(StockscoreNewApplication.class, args);
	}
}
