package com.heartrating.heartrating.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardRating {
    @Id
    @GeneratedValue
    private long id;
    private String notes;
    private int rating;
    private Long nId;

//
//    (fetch = FetchType.LAZY)
//    @JoinColumn(name="card_id")
   @ManyToOne
   @JsonIgnore
    private Card card;

    public Long getnId() {
        return nId;
    }

    public void setCard(Card card){
       this.card = card;
   }
}
