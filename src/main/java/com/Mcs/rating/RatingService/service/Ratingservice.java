package com.Mcs.rating.RatingService.service;

import com.Mcs.rating.RatingService.entities.Ratings;

import java.util.List;

public interface Ratingservice {

    //create rating
Ratings createRating(Ratings rating);

    //get all rating
List<Ratings> getAllRating();
    //get all rating on userid
    List<Ratings> getRatingByUserId(String userid);

    //get all rating on hotelid
    List<Ratings> getRatingByHotelId(String hotelid);
}
