package br.edu.up.application;

import br.edu.up.controllers.GameController;
import br.edu.up.models.Board;
import br.edu.up.views.BoardView;


public class Main {
    public static void main(String[] args) {
        Board model = new Board();
        BoardView view = new BoardView();
        GameController controller = new GameController(model, view);
        controller.startGame();
    }
}