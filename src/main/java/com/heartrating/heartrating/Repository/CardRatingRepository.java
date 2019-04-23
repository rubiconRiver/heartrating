package com.heartrating.heartrating.Repository;

import com.heartrating.heartrating.Model.Card;
import com.heartrating.heartrating.Model.CardRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cardratings", path="cardratingsREST")
public interface CardRatingRepository extends JpaRepository<CardRating, Long> {
    CardRating save(CardRating cardRating);


}
