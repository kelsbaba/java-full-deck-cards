package com.esegine.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>(52);
        createDeck();
    }

    private void createDeck(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public Card cardDealt() {
         return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}