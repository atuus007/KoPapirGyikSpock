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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import hu.abstergo.ati.kopapirgyikspock.Player;

/**
 *
 * @author Ati Player osztályhoz tartozó tesztek.
 */
public class PlayerJUnitTest {

    public PlayerJUnitTest() {
    }

    @Test
    public void testOne() {
        int point = Player.getPontszam1();
        int expRes = 100;
        assertNotEquals(expRes, point);
    }

    @Test
    public void testTwo() {
        int point = Player.getPontszam2();
        int expRes = 100;
        assertNotEquals(expRes, point);
    }

    @Test
    public void testThree() {
        Player.setPlayer1Win(false);
        boolean win = true;
        boolean expected = Player.isPlayer1Win();
        assertNotEquals(expected, win);
    }
    @Test
    public void testFive() {
        Player.setPlayer2Win(true);
        boolean win = false;
        boolean expected = Player.isPlayer2Win();
        assertNotEquals(expected, win);
    }
    @Test
    public void testSix() {
        Player.setGuess1("Papper");
        String guess=Player.getGuess1();
        assertNotNull(guess);
    }
    @Test
    public void testPlayer1Name() {
        Player.setName1("Egy Játék");
        String expName=Player.getName1();
        assertNotNull(expName);
    }
    @Test
    public void testPlayer2Name() {
        Player.setName2("Egy Játék");
        String expName=Player.getName2();
        assertNotNull(expName);
    }
    @Test
    public void testSetGuess2() {
        String expGuess="Lizzard";
        Player.setGuess2("Scorpion");
        assertNotEquals(expGuess, Player.getGuess2());
        
    }
    @Test
    public void testGetGuess2() {
        String expGuess=Player.getGuess2();
        
        assertNotNull(expGuess);
        
    }
    @Test
    public void testSetPontSzam1() {
        Player.setPontszam1(12);
        int point=Player.getPontszam1();
        int limit=1000;
        assertNotEquals(limit, point);
        
    }
    @Test
    public void testSetPontSzam2() {
        Player.setPontszam2(21);
        int point=Player.getPontszam2();
        int limit=1000;
        assertNotEquals(limit, point);
        
    }
}
