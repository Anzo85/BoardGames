package org.anzo.game;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game {


    public static void main(String[] args) throws IOException {


        GameStart TicTacToe = new TicTacToeGameStart();

        TicTacToe.createPlayer1();
        TicTacToe.createPlayer2();
        TicTacToe.createBoard();
        TicTacToe.gameMove();
        TicTacToe.GameFinish();


    }


}
