package com.Mcs.rating.RatingService.repository;

import com.Mcs.rating.RatingService.entities.Ratings;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Ratings,String> {
    //custom method creation
    List<Ratings> findByUserid(String userid); // Match the field name exactly

    List<Ratings> findByHotelid(String hotelid);
}
