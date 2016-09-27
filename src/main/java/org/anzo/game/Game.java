package org.anzo.game;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game {


    public static void main(String[] args) throws IOException {

        Player playerFirst = new Ai("Nikita", 20, 'X');
        Player playerSecond = new Human("Andrey", 31, 'O');

        Board board = new Board(playerFirst, playerSecond);

        GameMove GameSet = new GameMove(board);

        GameSet.gameMoveProcess();

        Winner win = new Winner(board);
        win.whoWinner();

    }


}
