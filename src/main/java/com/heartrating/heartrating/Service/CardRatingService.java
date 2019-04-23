package com.heartrating.heartrating.Service;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Repository.CardRatingRepository;
import com.heartrating.heartrating.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

@Service
@CrossOrigin(allowCredentials = "*")
public class CardRatingService {


    private CardRatingRepository cardRatingRepository;
    private CardRepository cardRepository;

    @Autowired
    public CardRatingService(CardRatingRepository cardRatingRepository, CardRepository cardRepository) {
        this.cardRatingRepository = cardRatingRepository;
        this.cardRepository = cardRepository;
    }


    public List<CardRating> findAllCardRatingsInService(){ return cardRatingRepository.findAll(); }

    @Transactional
    public CardRating saveCardRating(CardRating cardRating){
        cardRating.setCard(cardRepository.getOne(cardRating.getnId()));
        cardRatingRepository.save(cardRating);
        return cardRating;
    }
}
