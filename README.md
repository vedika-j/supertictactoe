# supertictactoe
Overview

This is an enhanced version of the classic Tic Tac Toe game written in Java, with a fun twist! The game supports standard Tic Tac Toe rules and includes a "cheat code" feature, allowing players to make additional moves in a single turn. The game also implements robust input handling and dynamic board display for a smooth and engaging experience.

Features

Standard Tic Tac Toe Gameplay: Players take turns marking their positions on a 3x3 grid to win.
Cheat Code Mode: Activate the cheat mode by entering 2023 to make two moves in one turn.
Dynamic Board Rendering: The board updates after every turn, providing a clear visual of the current state.
Winner Detection: Automatically checks for a winning combination or a draw after every move.
Interactive Console Input: Players are guided step-by-step, ensuring intuitive gameplay.
Gameplay Instructions

The game starts with player X, and players take turns entering slot numbers (1–9) to mark their positions.
To activate the cheat mode, enter 2023 and then input two slot numbers for your moves.
The game ends when:
A player forms a winning combination (row, column, or diagonal).
All slots are filled without a winner, resulting in a draw.
Code Highlights

Modular Design: The game logic is split into multiple methods for clarity and maintainability:
checkWinner(): Detects winning combinations or a draw.
printBoard(): Displays the current board state.
chance(): Handles player input and updates the board.
Cheat Mode: Allows for an additional move during the same turn, making the game more exciting!
Robust Input Validation: Ensures only valid slot numbers are accepted, preventing unexpected behavior.
