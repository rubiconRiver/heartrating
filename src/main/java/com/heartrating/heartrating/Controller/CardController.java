package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Service.CardRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CardController {
    @Autowired
    CardRatingService cardRatingService;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/cardrating")
    @ResponseBody
    public List<Card> findAll(){
        return cardRatingService.findAllinService();
    }


//    @PostMapping("/cardrating")
//    CardRating cardRating(@RequestBody CardRating cardRating){
//        return CardRatingService.save(cardRating);
//    }

}
