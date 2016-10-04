package org.anzo.game;

import java.io.IOException;


public class TicTacToeGameStart implements GameStart {

    Player playerFirst = createPlayer1();
    Player playerSecond = createPlayer2();

    public Player createPlayer1() {

        Player playerFirst = Ai.newInstance("Nikita", 20, 'X');
        return playerFirst;
    }

    public Player createPlayer2() {
        Player playerSecond = Human.newInstance("Andrey", 31, 'O');
        return playerSecond;
    }


    public Board createBoard() {
        Board board = new Board(playerFirst, playerSecond);
        return board;
    }

    Board board = createBoard();

    public void gameMove() throws IOException {
        GameMove GameSet = new GameMove(board);
        GameSet.gameMoveProcess();
    }

    public void GameFinish() throws IOException {

        Winner win = new Winner(board);
        win.whoWinner();
    }
}
