package io.datajek.spring.basics.movie_recommender_system.lesson2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Finding Nemo","Ice Age","Toy Story"};
    }
}
