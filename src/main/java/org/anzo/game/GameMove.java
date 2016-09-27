package org.anzo.game;


import java.io.IOException;

public class GameMove {

    Board board;

    public GameMove(Board board) throws IOException {

        this.board = board;

    }


    public void gameMoveProcess() throws IOException {

        while (!board.gameFinished()) {
            System.out.println("Player " + board.currentPlayer.getName() + " move");
            int move = board.currentPlayer.moveFromPlayer();
            int move2 = board.currentPlayer.moveFromPlayer();
            board.makeMove(move, move2);
            board.printBoard();
        }
    }
}
