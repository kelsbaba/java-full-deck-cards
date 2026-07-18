package com.esegine.cards;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Deck deck;
    private final List<Player> players;


    public Game() {
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null.");
        }
        for (Player activePlayer : players){
            if (activePlayer.getPlayerName().equalsIgnoreCase(player.getPlayerName())){
                throw new IllegalArgumentException("Player with this name " + player.getPlayerName() + " is already in the game!! ");
            }

        }

        players.add(player);
    }

    public void dealCards(int cardsPerPerson) {
        if (players.isEmpty()) {
            throw new IllegalStateException("There has to be at least one player");
        }
        if (cardsPerPerson < 1) {
            throw new IllegalArgumentException("CardPerPerson must be greater than zero");
        }
       final int totalCardsNeeded =players.size() * cardsPerPerson;
        if (totalCardsNeeded > getRemainingCards()) {
                throw new IllegalArgumentException("Insufficient cards in deck");
        }

            for (int i = 0; i < cardsPerPerson; i++) {
                for (Player player : players) {
                    player.receiveCard(deck.dealCard());

            }
        }


    }
    public int getRemainingCards() {
        return deck.getRemainingCards();
    }

    public void shuffleDeck() {
        deck.shuffle();
    }

    public void showHands() {
        for (Player player : players) {
            player.showHand();
        }
    }

}
