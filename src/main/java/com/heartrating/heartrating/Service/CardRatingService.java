package com.heartrating.heartrating.Service;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardRatingService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> findAllinService(){
        return cardRepository.findAll();
    }

//    public static CardRating save(CardRating cardRating){  //I don't think this should be static
//        System.out.println("cardRating = [" + cardRating + "]");
//        return cardRating;
//    }
}
