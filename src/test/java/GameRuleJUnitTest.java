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
    private Label lbres;
    private Label lbName;
    private GameRule gr;
    public GameRuleJUnitTest() {
        Label lbres=new Label();
        Label lbName=new Label();
        lbres.setId("lbRes");
        lbName.setId("lbName");
        lbres.setText("Winner: ");
        gr=new GameRule(lbres, lbName);
    }
    
    //public GameRule gr=new GameRule(Label lbRes, Label lbName);
    @Test
    public void testLabelRes(){
        String text=lbres.getText();
        assertNotNull(text);
    }
    @Test
    public void testOne(){
        
//        Player.setPontszam1(0);
//        Player.setPontszam2(0);
//        int exp=1;
//        String case1="Rock"; String case2="Rock";
//        gr.rule(case1, case2);
//        assertEquals(exp, Player.getPontszam1());
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
