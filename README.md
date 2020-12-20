# Tic-Tac-Toe https://hyperskill.org/projects/48

## Stage 1
Your first task in this project is to print the game grid in the console output. Use what you’ve learned about the `print()` function to print three lines, each containing three characters (X’s and O’s) to represent a game of tic-tac-toe where all fields of the grid have been filled in.

## Stage 2
In this stage, you will write a program that:

1. Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only `X`, `O` and `_` symbols.
2. Outputs a line of dashes `---------` above and below the grid, adds a pipe `|` symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.

## Stage 3
In this stage, your program should:

1. Take a string entered by the user and print the game grid as in the previous stage.
2. Analyze the game state and print the result. Possible states:
* `Game not finished` when neither side has three in a row but the grid still has empty cells.
* `Draw` when no side has a three in a row and the grid has no empty cells.
* `X wins` when the grid has three X’s in a row.
* `O wins` when the grid has three O’s in a row.
* `Impossible` when the grid has three X’s in a row as well as three O’s in a row, or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more, then the game state is impossible).

In this stage, we will assume that either X or O can start the game.

You can choose whether to use a space or underscore _ to print empty cells.
