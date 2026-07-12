package com.esegine.cards;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player("kelly");

        for (int i = 0; i < 5; i++){
            player.receiveCard(deck.cardDealt());
        }
        player.showHand();

    }
}
