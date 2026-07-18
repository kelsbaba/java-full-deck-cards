package com.esegine.cards;

import java.util.InputMismatchException;
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
                displayMenu();
            try {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        handleAddPlayer();
                        break;

                    case 2:
                        handleShuffleDeck();
                        break;

                    case 3:
                        handleDealCards();
                        break;

                    case 4:
                        game.showHands();
                        break;

                    case 5:
                        showRemainingCards();
                        break;

                    case 6: {
                        handleResetGame();
                        break;
                    }

                    case 7: {
                        System.out.println("Goodbye and thanks for playing!");
                        running = false;
                        break;

                    }
                    default:
                        System.out.println("Invalid choice, please select a number between 1 - 7.");
                }
            }
                catch(InputMismatchException e){
                    System.out.println("Invalid input, please enter a number.");
                    scanner.nextLine();
                }

            }
            while (running);
        }


    private void displayMenu() {
        System.out.println("============================");
        System.out.println("    JAVA FULL DECK CARDS");
        System.out.println("============================");

        System.out.println("1. Add Player");
        System.out.println("2. Shuffle Deck");
        System.out.println("3. Deal Cards");
        System.out.println("4. Show Players' Hands");
        System.out.println("5. Show Remaining Cards");
        System.out.println("6. New Game");
        System.out.println("7. Exit");
    }

    private void handleAddPlayer() {
        try {
            System.out.print("Enter Player's Name: ");
            String playerName = scanner.nextLine();

            game.addPlayer(new Player(playerName));
            System.out.println("Player '" + playerName + "' added successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleShuffleDeck() {
        try {
            game.shuffleDeck();
            System.out.println("Deck has been shuffled!");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleDealCards() {

        while (true) {
            try {
                System.out.print("Enter number of cards per player: ");
                int cardsPerPerson = scanner.nextInt();
                scanner.nextLine();

                game.dealCards(cardsPerPerson);
                System.out.println("Cards dealt successfully.");
                break;

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showRemainingCards() {
        int numberOfCardsRemaining = game.getRemainingCards();

        System.out.println(
                numberOfCardsRemaining + " card" +
                        (numberOfCardsRemaining != 1 ? "s" : "")
        );
    }

    private void handleResetGame() {
        game.resetGame();
        System.out.println("Game has been reset.");
    }

}

