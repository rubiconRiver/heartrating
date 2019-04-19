package com.heartrating.heartrating.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageURL;


    @OneToMany(
            orphanRemoval = true
    )
  //  @JoinTable(name = "card_rating", joinColumns = @JoinColumn(name = "card_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rating_id", referencedColumnName = "id"))
    private List<CardRating> cardRatings;
}

