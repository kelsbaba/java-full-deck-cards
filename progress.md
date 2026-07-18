# Java Full Deck Cards Project

## Sprint 1

### Goal

Build the foundation of the card game by modelling a standard 52-card deck using object-oriented principles.

### Completed

* Created `Suit` enum
* Created `Rank` enum
* Created `Card` class
* Created `Deck` class
* Auto-generated a standard 52-card deck

### Git Commit

`Initial deck implementation`

---

## Sprint 2

### Goal

Introduce players and implement the core deck interactions.

### Completed

* Added `shuffle()` method
* Created `Player` class
* Implemented `receiveCard()`
* Implemented `showHand()`

### Git Commit

`Add Player class and shuffle functionality`

---

## Sprint 3

### Goal

Implement the game engine and multiplayer card dealing.

### Completed

* Created `Game` class
* Implemented multiplayer card dealing
* Added validation for card dealing
* Implemented `start(cardsPerPlayer)`

### Git Commit

`Refactor game flow with start method`

---

## Sprint 4

### Goal

Build an interactive console-based user interface.

### Completed

* Created `ConsoleUI` class
* Added `Scanner` for user input
* Implemented a menu-driven interface
* Added a `do-while` menu loop
* Implemented `switch-case` routing
* Added interactive player creation
* Connected Shuffle Deck, Deal Cards, Show Hands, and Show Remaining Cards menu options
* Added graceful application exit
* Removed obsolete `start(cardsPerPlayer)` method from `Game`
* Refactored `Game` fields to `final`
* Tested and debugged the console application

### Git Commit

`feat: complete interactive console UI for card game`

---

## Sprint 5

### Goal

Improve application robustness through validation, exception handling, and better control flow.

### Completed

* Added validation for invalid menu input
* Added validation for invalid card count input
* Implemented `InputMismatchException` handling for menu selection
* Implemented `InputMismatchException` handling for card dealing
* Implemented `IllegalArgumentException` handling for invalid card requests
* Implemented `IllegalStateException` handling when attempting to deal cards before adding players
* Refactored the Deal Cards workflow by simplifying exception handling
* Improved control flow to return to the main menu when recovery is not possible
* Performed comprehensive testing of valid and invalid user scenarios

### Git Commit

`Implement menu-driven game flow and robust input validation`

---

## Sprint 6 (Planned)

### Goal

Introduce game state management so the application behaves like a real card game.

### Planned Tasks

* Prevent dealing cards more than once per game
* Introduce game state management
* Add **Reset/New Game** functionality
* Clear all player hands when starting a new game
* Create a fresh 52-card deck during reset
* Shuffle the deck automatically for a new game
* Prevent adding players after cards have been dealt
* Improve the overall game flow and user experience

## Sprint 7 – Game Reset

### Goal

Implement a complete game reset so the application can start a fresh game without restarting.

### Completed

* Added `resetGame()` to the `Game` class.
* Reset the deck by creating a new `Deck`.
* Cleared all players from the game.
* Reset the `cardsDealt` flag.
* Added **New Game** to the console menu.
* Moved **Exit** to menu option **7**.
* Successfully tested multiple game lifecycles without restarting the application.

## Next Sprint

* Perform a final code review and refactoring.
* Improve console messages and user experience.
* Review naming consistency and code organization.
* Prepare Version 1.0 release.

