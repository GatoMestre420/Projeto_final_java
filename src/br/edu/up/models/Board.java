package br.edu.up.models;

public class Board {

    private char[][] board;
    private char currentPlayer;

    public Board(){
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    

    public Board(char[][] board, char currentPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
    }



    public char getCurrentPlayer(){

        return currentPlayer;
    }

    public void setCurrentPlayer(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void switchPlayer(){
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean placeMark(int row, int col){
        if(row >= 0 && col >= 0 && row < 3 && row < 3){
            if(board[row][col] == '-'){
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false;
    }

    public boolean checkForWin(){
        return (checkRows() || checkColumns() || checkDiagonals());

    }

    public boolean isBoardFull(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkRows(){
        for(int i = 0; i < 3; i ++){
            if(board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer ){
                return true;
            }
        }
        return false;
    } 

    private boolean checkColumns(){
        for(int i = 0; i < 3; i ++){
            if(board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer){
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(){
        if((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) || (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)){
            return true;
        }
        return false;
    }

    public void initializeBoard(){
        for(int i = 0; i < 3 ; i ++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    public char[][] getBoard(){
        return board;
    }



}
