package com.Mcs.rating.RatingService.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("ratings")
public class Ratings {
    private String ratingid;
    private String userid;
    private String hotelid;
    private int rating;
    private String feedback;

    public String getRatingid() {
        return ratingid;
    }

    public void setRatingid(String ratingid) {
        this.ratingid = ratingid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
