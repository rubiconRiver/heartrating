package com.heartrating.heartrating.Repository;

import com.heartrating.heartrating.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cards", path="cardsREST")
public interface CardRepository extends JpaRepository<Card, Long> {
     List<Card> findAll();
     Card save(Card card);
     Card getOne(Long id);
        }