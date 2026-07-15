package com.esegine.cards;

import java.util.Scanner;

public class ConsoleUI {

        private final Scanner scanner;
        private final Game game;

        public ConsoleUI() {
            scanner = new Scanner(System.in);
            game = new Game();
        }

        public void start(){

            boolean running = true;
            do {
                System.out.println("============================");
                System.out.println("    JAVA FULL DECK CARDS"     );
                System.out.println("============================");

                System.out.println("1. Add Player");
                System.out.println("2. Shuffle Deck");
                System.out.println("3. Deal Cards");
                System.out.println("4. Show Players' Hands");
                System.out.println("5. Show Remaining Cards");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        System.out.print("Enter Player's Name:");
                        String playerName = scanner.nextLine();
                        game.addPlayer(new Player(playerName));
                        System.out.println("Player " + playerName + " added successfully");
                        break;

                    case 2:
                        game.shuffleDeck();
                        System.out.println("Deck has been shuffled!");
                        break;

                    case 3:
                        System.out.println("Enter number of cards per player:");
                        int cardsPerPerson = scanner.nextInt();
                        scanner.nextLine();
                        game.dealCards(cardsPerPerson);
                        break;

                    case 4:
                        game.showHands();
                        break;

                    case 5:
                       int numberOfCardsRemaining = game.getRemainingCards();
                        System.out.println(numberOfCardsRemaining + " card" +((numberOfCardsRemaining > 1)? "s" : ""));
                        break;

                    case 6:{
                        System.out.println("Goodbye and thanks for playing!");
                        running = false ;
                        break;

                    }
                    default:
                        System.out.println("Invalid choice, please select a number between 1 - 6.");
                }

            }
            while (running == true);
        }

}

