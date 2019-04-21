package com.heartrating.heartrating.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class CardRating {
    @Id
    @GeneratedValue
    private long id;
    private String notes;
    private int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="card_id")
    @JsonIgnore

    private Card card;
}
