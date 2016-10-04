package org.anzo.game;

/**
 * Created by anzo0316 on 9/30/2016.
 */
public abstract class BasicBoard {


    public char[][] board;

    Player playerFirst;
    Player playerSecond;

    public Player currentPlayer;


    private final void changePlayer() {
        if (currentPlayer == playerFirst) {
            currentPlayer = playerSecond;
        } else {
            currentPlayer = playerFirst;
        }
    }


    public final boolean makeMove(int move, int move2) {


        int i = move;
        int j = move2;

        if (validateMove(i, j)) {
            board[i][j] = currentPlayer.getType();

            changePlayer();
            return true;
        }
        return false;
    }


    abstract boolean validateMove(int a, int b);

    abstract boolean gameFinished();

    abstract void fillBoard();

    abstract void printBoard();

    public final Player getWinner() {

        changePlayer();

        return currentPlayer;
    }


}
