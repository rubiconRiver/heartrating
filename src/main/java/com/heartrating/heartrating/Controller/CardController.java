package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Repository.CardRatingRepository;
import com.heartrating.heartrating.Service.CardRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {
    @Autowired
    CardRatingService cardRatingService;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/cardrating")
    @ResponseBody
    public List<Card> findAll(){
        return cardRatingService.findAllinService();
    }


   @PostMapping("/cardrating")
   public CardRating saveCardRatings(@RequestBody CardRating cardRating){
        return cardRatingService.save(cardRating);
    }

}
