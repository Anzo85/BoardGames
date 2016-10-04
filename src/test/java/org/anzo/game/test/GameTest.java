package org.anzo.game.test;


import org.anzo.game.Board;
import org.anzo.game.Game;
import org.anzo.game.Human;
import org.anzo.game.Player;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {


    Board bord;

    @Before

    public void setUp() {


        Player p1 = Human.newInstance("xxx", 14, 'X');
        Player p2 = Human.newInstance("ooo", 15, 'O');
        bord = new Board(p1, p2);

    }


    @Test

    public void WinnerTest() {


        bord.makeMove(0, 0);
        bord.makeMove(2, 1);
        bord.makeMove(0, 1);
        bord.makeMove(2, 2);
        bord.makeMove(0, 2);

        bord.printBoard();

        assertThat(bord.gameFinished(), is(true));


    }

    @Test

    public void NoWinnerTest() {

        bord.makeMove(0, 0);
        bord.makeMove(2, 1);
        bord.makeMove(0, 1);
        bord.makeMove(2, 2);

        bord.printBoard();

        assertThat(bord.gameFinished(), is(false));

    }

    @Test

    public void PrintWinnerTest(){


        bord.makeMove(0,0);
        bord.makeMove(2,1);
        bord.makeMove(0,1);
        bord.makeMove(2,2);
        bord.makeMove(0,2);

        bord.printBoard();

        Player player = bord.getWinner();
        System.out.println(player.getName());

        assertThat(player.getName(), is("xxx") );




    }

    @Test

    public void testValidateMove01() {
        bord.makeMove(0, 0);
        bord.printBoard();
        assertThat(bord.validateMove(0, 0), is(false));
    }

    @Test

    public void testValidateMove02() {
        bord.makeMove(0, 0);
        bord.printBoard();
        assertThat(bord.validateMove(0, 1), is(true));
    }


}
