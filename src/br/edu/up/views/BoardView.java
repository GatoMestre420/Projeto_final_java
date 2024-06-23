
package br.edu.up.views;

import br.edu.up.models.Board;

public class BoardView {

    public void printBoard(Board board) {
        char[][] gameBoard = board.getBoard();
        System.out.println("Current board layout:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printWinner(char currentPlayer) {
        System.out.println("Player " + currentPlayer + " wins!");
    }

    public void printDraw() {
        System.out.println("The game is a draw!");
    }
}
