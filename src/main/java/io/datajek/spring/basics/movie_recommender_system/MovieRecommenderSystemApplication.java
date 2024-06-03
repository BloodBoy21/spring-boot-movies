package io.datajek.spring.basics.movie_recommender_system;

import io.datajek.spring.basics.movie_recommender_system.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movie_recommender_system.lesson1.RecommenderImplementation;
import io.datajek.spring.basics.movie_recommender_system.lesson2.CollaborativeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}

}
