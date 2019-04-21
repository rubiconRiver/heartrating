package com.heartrating.heartrating.Service;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin(allowCredentials = "*")
public class CardRatingService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> findAllinService(){
        return cardRepository.findAll();
    }

   public CardRating save(CardRating cardRating){  
        System.out.println("cardRating = [" + cardRating + "]");
     return cardRating;
   }
}
