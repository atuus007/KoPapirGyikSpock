/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ati
 */
public class Player {

    private static String name1, name2, guess1, guess2;
    private static boolean player1Win = false, player2Win = false;

    public static boolean isPlayer1Win() {
        return player1Win;
    }

    public static boolean isPlayer2Win() {
        return player2Win;
    }

    public static void setPlayer1Win(boolean player1Win) {
        Player.player1Win = player1Win;
    }

    public static void setPlayer2Win(boolean player2Win) {
        Player.player2Win = player2Win;
    }
    private static int pointPlayer1, pointPlayer2, id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Player.id = id;
    }

    public static void setGuess1(String guess1) {
        Player.guess1 = guess1;
    }

    public static void setGuess2(String guess2) {

        Player.guess2 = guess2;
    }

    public static String getGuess1() {
        return guess1;
    }

    public static String getGuess2() {
        return guess2;
    }

    public static void setName1(String name1) {
        Player.name1 = name1;
    }

    public static void setName2(String name2) {
        Player.name2 = name2;
    }

    public static String getName1() {
        return name1;
    }

    public static String getName2() {
        return name2;
    }

    public static int getPontszam1() {
        return pointPlayer1;
    }

    public static int getPontszam2() {
        return pointPlayer2;
    }

    public static void setPontszam1(int pontszam) {
        Player.pointPlayer1 = pontszam;
    }

    public static void setPontszam2(int pontszam) {
        Player.pointPlayer2 = pontszam;
    }

}
