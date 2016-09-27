package org.anzo.game;

import java.io.BufferedReader;
import java.io.IOException;

public interface Player {


    int moveFromPlayer() throws IOException ;




    public char getType();

    public String getName();

    public int getAge();

   // int moveFromPlayer(BufferedReader set) throws IOException;
}