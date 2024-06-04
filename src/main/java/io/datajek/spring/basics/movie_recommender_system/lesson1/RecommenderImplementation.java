package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.CollaborativeFilter;
import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor executed");
    }
    public  String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: "+filter + "\n");
        CollaborativeFilter filter = new CollaborativeFilter();
        return filter.getRecommendations(movie);
    }
}
