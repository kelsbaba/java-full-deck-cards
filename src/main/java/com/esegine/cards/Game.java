package com.esegine.cards;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private  Deck deck;
    private final List<Player> players;
    private boolean cardsDealt;


    public Game() {
        this.deck = new Deck();
        this.players = new ArrayList<>();
        this.cardsDealt = false ;
    }

    public void addPlayer(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null.");
        }
        if (cardsDealt) {
            throw new IllegalStateException("Cannot add players after cards have been dealt.");
        }
        for (Player activePlayer : players){
            if (activePlayer.getPlayerName().equalsIgnoreCase(player.getPlayerName())){
                throw new IllegalArgumentException("Player with this name " + player.getPlayerName() + " is already in the game!! ");
            }

        }

        players.add(player);
    }

    public void dealCards(int cardsPerPerson) {
        if (cardsDealt) {
            throw new IllegalStateException("Cards have already been dealt. Please start a new game.");
        }
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
        cardsDealt = true;

    }
    public int getRemainingCards() {
        return deck.getRemainingCards();
    }

    public void shuffleDeck() {
        if (cardsDealt) {
            throw new IllegalStateException(
                    "Cannot shuffle the deck after cards have been dealt. Please start a new game."
            );
        }
        deck.shuffle();
    }

    public void showHands() {
        for (Player player : players) {
            player.showHand();
        }
    }

    public void resetGame(){
        this.deck = new Deck();
        players.clear();
        cardsDealt = false;
    }

}
