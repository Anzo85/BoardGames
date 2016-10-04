package org.anzo.game;

import java.io.IOException;


public interface GameStart {


    Player createPlayer1();

    Player createPlayer2();

    Board createBoard();

    void gameMove() throws IOException;

    void GameFinish() throws IOException;


}
