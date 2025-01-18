package com.Mcs.rating.RatingService.controller;

import com.Mcs.rating.RatingService.entities.Ratings;
import com.Mcs.rating.RatingService.service.Ratingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private Ratingservice ratingservice;

    //create rating
    @PostMapping
    public ResponseEntity<Ratings> createRating(@RequestBody Ratings rating)
    {
        Ratings rating1=ratingservice.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    //get speicified user rating using rating id
    @GetMapping("/user/{userid}")
    public ResponseEntity<List<Ratings>> getUserRating(@PathVariable String userid)
    {
       List<Ratings> userrating=ratingservice.getRatingByUserId(userid);
       return ResponseEntity.ok(userrating);
    }
    @GetMapping("/api/{hotelid}")
    public ResponseEntity<List<Ratings>> getHotelRating(String hotelid)
    {
       List<Ratings> ratings=ratingservice.getRatingByHotelId(hotelid);
       return ResponseEntity.ok(ratings);
    }
    @GetMapping
    public ResponseEntity<List<Ratings>> getAllRating()
    {
       List<Ratings> ratings=ratingservice.getAllRating();
       return ResponseEntity.ok(ratings);
    }
}
