package com.Mcs.rating.RatingService.controller;

import com.Mcs.rating.RatingService.entities.Rating;
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
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        Rating rating1=ratingservice.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }
    @GetMapping("/user/{userid}")
    public ResponseEntity<List<Rating>> getUserRating(@PathVariable String userid)
    {
       List<Rating> userrating=ratingservice.getRatingByUserId(userid);
       return ResponseEntity.ok(userrating);
    }
    @GetMapping("/api/{hotelid}")
    public ResponseEntity<List<Rating>> getHotelRating(String hotelid)
    {
       List<Rating> ratings=ratingservice.getRatingByHotelId(hotelid);
       return ResponseEntity.ok(ratings);
    }
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating()
    {
       List<Rating> ratings=ratingservice.getAllRating();
       return ResponseEntity.ok(ratings);
    }
}
