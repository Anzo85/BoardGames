package org.anzo.game;


public class Winner {

    Board board;

    Winner(Board board) {
        this.board = board;
    }


    public void whoWinner(){

        Player player = board.getWinner();
        System.out.println("Congratulation !!! The winner is: " + player.getName() + " " + player.getAge());
    }
}
