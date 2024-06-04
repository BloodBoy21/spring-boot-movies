package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import io.datajek.spring.basics.movie_recommender_system.lesson9.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;


    @Autowired
    private Movie movie;

    public  ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie) {
       return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
