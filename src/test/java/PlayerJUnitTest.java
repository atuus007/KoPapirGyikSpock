/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Ati
 * Player osztályhoz tartozó tesztek.
 */
public class PlayerJUnitTest {
    
    public PlayerJUnitTest() {
    }
    @Test
    public void testOne(){
        int point=Player.getPontszam1();
        int expRes=100;
        
        assertNotEquals(expRes, point);
    }
    @Test
    public void testTwo(){
       int point=Player.getPontszam2();
       int expRes=100;
       assertNotEquals(expRes,point);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
