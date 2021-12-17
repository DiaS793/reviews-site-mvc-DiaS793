package org.wecancoeit.reviews;

public class Review {


    private Long id;
    private String title;
    private String image_url;
    private String review_category;
    private String content;
    private String dateOfReview;
    private String description;
    private String sources;

    public Review (){

    }

    public Review(long id, String title, String image_url, String review_category,String description, String content, String dateOfReview, String sources) {
        this.id=id;
        this.title=title;
        this.image_url=image_url;
        this.review_category=review_category;
        this.content=content;
        this.dateOfReview=dateOfReview;
        this.description=description;
        this.sources = sources;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getReview_category() {
        return review_category;
    }

    public String getContent() {
        return content;
    }

    public String getDateOfReview() {
        return dateOfReview;
    }

    public String getDescription() {
        return description;
    }

    public String getSources(){
        return sources;
    }




}
