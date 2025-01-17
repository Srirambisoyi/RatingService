package com.Mcs.rating.RatingService.repository;

import com.Mcs.rating.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating,String> {
    //custom method creation
    List<Rating> findByUserid(String userid); // Match the field name exactly

    List<Rating> findByHotelid(String hotelid);
}
