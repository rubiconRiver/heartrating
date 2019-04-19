package com.heartrating.heartrating.Service;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardRatingService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> find(){
        return cardRepository.findAll();
    }
}
