package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    //building database

    @Test
    public void shouldFindReviewOne(){
        Review reviewOne = new Review(1l, "title", "image-url", "review_category",
                "description", "content", "dateOfReview", "sources");
        ReviewRepository underTest = new ReviewRepository (reviewOne);
        //findOne method
        Review foundReview = underTest.findOne(1l);
        //matches foundReview with review One id
        assertEquals (foundReview, reviewOne);

    }
}
