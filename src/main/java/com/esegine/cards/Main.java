package com.esegine.cards;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.addPlayer(new Player("Kelly"));
        game.addPlayer(new Player("John"));
        game.addPlayer(new Player("Mary"));
        game.addPlayer(new Player("David"));
        game.addPlayer(new Player("Louis"));

        game.start(4);
    }
}
