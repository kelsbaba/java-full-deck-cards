package com.esegine.cards;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 5; i++){
            System.out.println(deck.cardDealt());
        }

    }
}
