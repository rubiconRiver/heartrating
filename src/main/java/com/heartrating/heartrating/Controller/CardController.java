package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Repository.CardRatingRepository;
import com.heartrating.heartrating.Service.CardRatingService;
import com.heartrating.heartrating.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping(path = "/cards")
    @ResponseBody
    public List<Card> findAllCard(){
        return cardService.findAllCardsInService();
    }

}
