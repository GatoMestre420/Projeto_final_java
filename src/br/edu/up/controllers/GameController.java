package br.edu.up.controllers;

import java.util.Scanner;

import br.edu.up.models.Board;
import br.edu.up.views.BoardView;

public class GameController {

    private Board model;
    private BoardView view;

    public GameController(Board model,  BoardView view){
        this.model = model;
        this.view = view;
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        view.printBoard(model);

        while (true) {
            System.out.println("Player " + model.getCurrentPlayer() + ", enter your move (row and column): ");
            int row = sc.nextInt();
            int column = sc.nextInt();

            if(model.placeMark(row, column)){
                view.printBoard(model);

            if(model.checkForWin()){
                view.printWinner(model.getCurrentPlayer());
            }

            if(model.isBoardFull()){
                view.printDraw();
                break;
            }

            model.switchPlayer();
        } else {
            System.out.println("This move in not valid");
        }
    }

        sc.close();
    }

}
