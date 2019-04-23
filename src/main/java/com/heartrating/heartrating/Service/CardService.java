package com.heartrating.heartrating.Service;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card saveCard(Card card){
        cardRepository.save(card);
        return card;
    }

    public List<Card> findAllCardsInService(){
        return cardRepository.findAll();
    }
}
