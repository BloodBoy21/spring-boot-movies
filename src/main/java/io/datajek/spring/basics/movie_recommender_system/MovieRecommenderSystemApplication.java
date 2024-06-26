package io.datajek.spring.basics.movie_recommender_system;

import io.datajek.spring.basics.movie_recommender_system.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movie_recommender_system.lesson1.RecommenderImplementation;
import io.datajek.spring.basics.movie_recommender_system.lesson9.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		System.out.println("Constructor injection in RecommenderImplementation class");
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		//Retrieve singleton bean from application context
		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContentBasedFilter bean with singleton scope");
		System.out.println(filter);

		//Retrieve prototype bean from the singleton bean thrice
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		//Print number of instances of each bean
		System.out.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
		System.out.println("Movie instances created: "+ Movie.getInstances());
	}

}
