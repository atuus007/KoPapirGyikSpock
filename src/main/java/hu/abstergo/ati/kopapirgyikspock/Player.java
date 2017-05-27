/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

/*-
 * #%L
 * KoPapirGyikSpock
 * %%
 * Copyright (C) 2017 Debreceni Egyetem, Informatikai Kar
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * #L%
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ati 
 * A játékososk neveit és lépéseiket tartalmazó osztály.
 * 
 *
 */
public class Player {

    private static String name1;  
    private static String name2;  
    private static String guess1;  
    private static String guess2;
    private static boolean player1Win = false;
    private static boolean player2Win = false;
    /**
     * Az első játékos pontszáma.
     */
    private static int pointPlayer1;
    /**
     * A második játékos pontszáma.
     */
    private static int pointPlayer2;
    
    /**
     * @return Azzal az értékkel tér vissza hogy az elő játékos nyert-e.
     */
    
    public static boolean isPlayer1Win() {
        return player1Win;
    }

    /**
     * @return  Azzal az értékkel tér vissza hogy az második játékos nyert-e.
     */
    public static boolean isPlayer2Win() {
        return player2Win;
    }

    /**
     * @param player1Win Ez a paraméter true ha az első játékos nyert egyébként false.
     */
    public static void setPlayer1Win(boolean player1Win) {
        Player.player1Win = player1Win;
    }

    /**
     * @param player2Win Ez a paraméter true ha az első játékos nyert egyébként false.
     */
    public static void setPlayer2Win(boolean player2Win) {
        Player.player2Win = player2Win;
    }
   
    /**
     * @param guess1 Az első játékos által választott mező értéke.
     */
    public static void setGuess1(String guess1) {
        Player.guess1 = guess1;
    }

    /**
     * @param guess2 A második játékos által választott mező értéke.
     */
    public static void setGuess2(String guess2) {

        Player.guess2 = guess2;
    }

    /**
     * @return Visszaadja az első játékos válaszát.
     */
    public static String getGuess1() {
        return guess1;
    }

    /**
     * @return Visszaadja a második játékos válaszát.
     */
    public static String getGuess2() {
        return guess2;
    }

    /**
     * @param name1 Beállítja az első játékos nevét.
     */
    public static void setName1(String name1) {
        Player.name1 = name1;
    }

    /**
     * @param name2 Beállitja a második játékos nevét.
     */
    public static void setName2(String name2) {
        Player.name2 = name2;
    }

    /**
     * @return Visszaadja az első játékos nevét.
     */
    public static String getName1() {
        return name1;
    }

    /**
     * @return Visszaadja az első játékos nevét.
     */
    public static String getName2() {
        return name2;
    }

    /**
     * @return Visszaadja az első játékos által elért pontszámot
     */
    public static int getPontszam1() {
        return pointPlayer1;
    }

    /**
     * @return  Visszaadja a második játékos által elért pontszámot
     */
    public static int getPontszam2() {
        return pointPlayer2;
    }

    /**
     * @param pontszam Beállitja az első játékos pontszámát
     */
    public static void setPontszam1(int pontszam) {
        Player.pointPlayer1 = pontszam;
    }

    /**
     * @param pontszam Beállitja a második játékos pontszámát
     */
    public static void setPontszam2(int pontszam) {
        Player.pointPlayer2 = pontszam;
    }

}
