package org.anzo.game;

public class Board {

    public static final int BOARD_SIZE = 3;
    private char[][] board;

    Player playerFirst;
    Player playerSecond;

    public Player currentPlayer;


    public Board(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }

    public boolean makeMove(int move, int move2) {


        int i = move;
        int j = move2;

        if (validateMove(i, j)) {
            board[i][j] = currentPlayer.getType();

            changePlayer();
        }
        return true;
    }

    private void changePlayer() {
        if (currentPlayer == playerFirst) {
            currentPlayer = playerSecond;
        } else {
            currentPlayer = playerFirst;
        }
    }

    public boolean validateMove(int i, int j) {

        if (board[i][j] == 'X' || board[i][j] == 'O') {
            return false;

        }
        return true;
    }


    public boolean gameFinished() {
        // check X
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            return true;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][20] == 'X') {
            return true;
        }
        // check Y
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            return true;
        } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            return true;
        } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            return true;
        } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][20] == 'O') {
            return true;
        }


        return false;
    }

    public void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        //todo add symbols to show board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Player getWinner() {

        changePlayer();

        return currentPlayer;
    }
}
