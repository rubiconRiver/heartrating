package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Service.CardRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins ="*")
@RestController
public class CardRatingController {
    @Autowired
    CardRatingService cardRatingService;


    @GetMapping(path = "/cardrating")
    @ResponseBody
    public List<CardRating> findAllCardRating(){
        return cardRatingService.findAllCardRatingsInService();
    }

    @PostMapping("/cardrating")
    public CardRating saveCardRatings(@RequestBody CardRating cardRating){
        return cardRatingService.saveCardRating(cardRating);
    }
}
