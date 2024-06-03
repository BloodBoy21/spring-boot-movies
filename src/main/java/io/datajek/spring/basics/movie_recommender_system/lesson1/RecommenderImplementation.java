package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.CollaborativeFilter;
import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;

public class RecommenderImplementation {
    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public  String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: "+filter + "\n");
        CollaborativeFilter filter = new CollaborativeFilter();
        return filter.getRecommendations(movie);
    }
}
