package io.datajek.spring.basics.movie_recommender_system.lesson1;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
       return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
