package com.esegine.cards;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private List<Card> hand;

    public Player(String playerName){
        if (playerName == null){
            throw new IllegalArgumentException("Player name cannot be null");
        }
        playerName = playerName.trim();
        if (playerName.isEmpty()){
            throw new IllegalArgumentException("Player name cannot be empty");
        }
        this.playerName = playerName;
        this.hand = new ArrayList<>();
    }

    public String getPlayerName(){
        return playerName;
    }

    public void receiveCard(Card card){
        hand.add(card);
    }

    public void showHand(){
        System.out.println(playerName + " has " + hand.size() + " cards: ");
        int i = 1;
        for (Card card : hand){
            System.out.println(i + ". " + card);
            i++;
        }
    }

    public int getHandSize(){
        return hand.size();
    }

}
