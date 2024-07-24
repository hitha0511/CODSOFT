
# Tic-Tac-Toe Game

Welcome to the Tic-Tac-Toe game! This project is a graphical implementation of the classic Tic-Tac-Toe game using Java Swing. It supports two game modes:
1. Two Players: Play against a friend on the same computer.
2. Play Against Bot: Play against a simple AI bot.


## Features

- Two-Player Mode: Play against another person with alternating turns.
- AI Mode: Play against a basic bot that makes random moves.
- Graphical User Interface: Intuitive UI with buttons to start/restart the game and end the game.
- Game Status: Alerts for win conditions or ties.


## Getting Started

Prerequisites:
- Java Development Kit (JDK) 8 or higher.
- An IDE that supports Java (e.g., IntelliJ IDEA, Eclipse) or a simple text editor
## How to run
### 1. Clone the Repository

```bash
  git clone https://github.com/your-username/tic-tac-toe.git
  cd tic-tac-toe
```
### 2. Compile the Code
```bash
  javac -d bin src/CodSoft/*.java
```
### 3. Run the Application
```bash
  java -cp bin CodSoft.TicTacToe
```

## How to Play
#### 1. Start the Game: 
  Choose between "Two Players" or "Play Against Bot" on the main menu.
#### 2. Make Moves: 
  Click on the buttons in the 3x3 grid to place your move (X or O).
#### 3. Game End: 
  The game ends when a player wins or the board is full. A message will display the result.
#### 4. Restart/End Game: 
  Use the "Restart" button to reset the game or the "End" button to return to the main menu.

## Code Overview
#### TicTacToe.java:
 The main application file which initializes the GUI and displays the main menu.
#### GamePanel.java:
Manages the game board, handles user interactions, and updates the UI based on game state.
#### GameLogic.java: 
Contains the core game logic, including move validation, checking for winners, and switching players.
## Contributing

Feel free to fork the repository and submit pull requests for any improvements or bug fixes. Please ensure that any changes adhere to the existing code style and include appropriate tests if applicable.


## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact
For any questions or feedback, please contact hitharn0504@gmail.com


## Screenshots

![TicTacToe Screenshot](https:file:///C:/Users/Dell/Downloads/TicTacToe.png)
![Tie Screenshot](https:file:///C:/Users/Dell/Downloads/TicTacToe_tie.png)
![Bot wins Screenshot](https:file:///C:/Users/Dell/Downloads/TicTacToe_bot.png)



