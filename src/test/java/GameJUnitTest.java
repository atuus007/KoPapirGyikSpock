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
 * @author Fodor Edit
 */
public class GameJUnitTest {
    
    public GameJUnitTest() {
    }
    @Test
    public void testOne(){
        int point=Player.getPontszam1();
        double expRes=0;
        assertEquals(expRes, point, 0);
    }
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
