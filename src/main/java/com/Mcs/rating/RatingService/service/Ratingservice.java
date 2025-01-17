package com.Mcs.rating.RatingService.service;

import com.Mcs.rating.RatingService.entities.Rating;

import java.util.List;

public interface Ratingservice {

    //create rating
Rating createRating(Rating rating);

    //get all rating
List<Rating> getAllRating();
    //get all rating on userid
    List<Rating> getRatingByUserId(String userid);

    //get all rating on hotelid
    List<Rating> getRatingByHotelId(String hotelid);
}
