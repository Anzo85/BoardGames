package org.anzo.game;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game {


    public static void main(String[] args) throws IOException {

        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));


        Player playerFirst = new Player("Bob", 25, 'X');
        Player playerSecond = new Player("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished()) {
            System.out.println("Player " + board.currentPlayer.getName() + " move");
            int move = getMoveFromConsole(set);
            int move2 = getMoveFromConsole(set);
            board.makeMove(move, move2);
            board.printBoard();
        }

        Player player = board.getWinner();
        System.out.println("Congratulation !!! The winner is: " + player.getName() + " " + player.getAge());

    }

    private static int getMoveFromConsole(BufferedReader set) throws IOException {

        System.out.print("Enter move: ");
        int n = Integer.parseInt(set.readLine());

        return n;
    }
}