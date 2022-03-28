package org.wecancoeit.reviews;

import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

    //Hash map creates a collect that holds the reviews via Key and Value.
    // In this case it is the Long and Review that are the Key and Value.
    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(Review reviewToAdd){
        //places review into the HashMap collection
        //primary key or id   Value or Object
        reviewsList. put(reviewToAdd.getId(), reviewToAdd);
    }

    public Review findOne(long id) {
        //returns a course that it's gonna grab by ID
        return null;
    }
}
