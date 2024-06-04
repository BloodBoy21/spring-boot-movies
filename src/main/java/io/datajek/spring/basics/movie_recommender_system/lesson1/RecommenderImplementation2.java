package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.CollaborativeFilter;
import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;
    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter executed");
    }
    public  String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: "+filter + "\n");
        CollaborativeFilter filter = new CollaborativeFilter();
        return filter.getRecommendations(movie);
    }
}
