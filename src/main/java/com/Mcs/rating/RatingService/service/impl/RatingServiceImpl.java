package com.Mcs.rating.RatingService.service.impl;

import com.Mcs.rating.RatingService.entities.Ratings;
import com.Mcs.rating.RatingService.repository.RatingRepo;
import com.Mcs.rating.RatingService.service.Ratingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements Ratingservice {
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Ratings createRating(Ratings rating) {
       String id=UUID.randomUUID().toString();
       rating.setRatingid(id);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Ratings> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Ratings> getRatingByUserId(String userid) {
        return ratingRepo.findByUserid(userid);
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelid) {
        return ratingRepo.findByHotelid(hotelid);
    }
}
