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
import hu.abstergo.ati.kopapirgyikspock.GameRule;
import hu.abstergo.ati.kopapirgyikspock.Player;
import javafx.scene.control.Label;

/**
 *
 * @author Fodor Edit
 */
public class GameRuleJUnitTest {
    
    GameRule gr;
    public GameRuleJUnitTest() {
//        Label lbres=new Label();
//        Label lbName=new Label();
//        lbres.setId("lbRes");
//        lbName.setId("lbName");
//        lbres.setText("Winner: ");
//        gr=new GameRule(lbres, lbName);
    }
    
    //public GameRule gr=new GameRule(Label lbRes, Label lbName);
    @Test
    public void testLabelRes(){
//        String text=lbres.getText();
//        assertNotNull(text);
    }
    @Test
    public void testOne(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Spock", "Spock");
        boolean exp=true;
        boolean res=Player.isPlayer1Win();
        assertEquals(exp, res);
    
        
    }
    @Test
    public void testTwo(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Spock", "Spock");
        boolean exp=true;
        boolean res=Player.isPlayer2Win();
        assertEquals(exp, res);
    
        
    }
    @Test
    public void testThree(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Spock");
        boolean exp=false;
        boolean res=Player.isPlayer1Win();
        assertEquals(exp, res);
    
        
    }
     @Test
    public void testFour(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Spock");
        boolean exp=true;
        boolean res=Player.isPlayer2Win();
        assertEquals(exp, res);
    }
    @Test
    public void testFive(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Rock");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testSix(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Paper");
        boolean exp=false;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testSeven(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Scissor");
        boolean exp=false;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testEight(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Rock", "Lizzard");
        boolean exp=false;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testNine(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Rock");
        boolean exp=false;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testTen(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Paper");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testEleven(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Paper");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void testTwelve(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Scissor","Scissor");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
     @Test
    public void test13(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Scissor");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
     @Test
    public void test14(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Lizzard");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void test15(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Paper","Spock");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void test16(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Scissor","Rock");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void test17(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Scissor","Paper");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    @Test
    public void test18(){
        GameRule gr=new GameRule(null, null);
        gr.rule("Scissor","Lizzard");
        boolean exp=true;
        boolean res1=Player.isPlayer1Win();
        boolean res2=Player.isPlayer2Win();
        assertEquals(exp, (res1&&res2));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
