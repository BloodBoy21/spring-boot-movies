package io.datajek.spring.basics.movie_recommender_system.lesson2;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Finding Nemo","Ice Age","Toy Story"};
    }
}
