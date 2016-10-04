package org.anzo.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by andreyz on 25.09.16.
 */
public class Human implements Player {

    private String name;
    private int age;
    private char type;

    private Human(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Human newInstance(String name, int age, char type) {
        return new Human(name, age, type);
    }

    public int moveFromPlayer() throws IOException {


        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter move: ");
        int n = Integer.parseInt(set.readLine());

        return n;
    }


}
