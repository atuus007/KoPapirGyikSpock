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

import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ati
 * Ez az osztály implementálja a játék szabályait.
 * 
 */
public class GameRule {

    private static final Logger logger = LoggerFactory.getLogger(GameRule.class);
    private final Label lbResult;
    private final Label lbWinName;
    /**
     * @param lbRes Az aktuális kör nyertesének jelzése.
     * @param lbName A nyertes játékos nevének kiirására szolgáló Label.
     */
    
    public GameRule(final Label lbRes, final Label lbName) {
        this.lbResult = lbRes;
        this.lbWinName=lbName;
    }
     
    /**
     * @param player1 Az első játékos választása.
     * @param player2 A második játékos választása.
     * Azt dönti el játékosok alapán hogy melyik játékos kap pontot és hogy melyik játékos nyeri az aktuális kört.
     */
    public void rule(String player1, String player2) {

        if (player1.equals("Rock") && player2.equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (player1.equals("Rock") && player2.equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Rock") && player2.equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Rock") && player2.equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Rock") && player2.equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (player1.equals("Paper") && player2.equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Paper") && player2.equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Paper") && player2.equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Paper") && player2.equals("Lizzard")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Paper") && player2.equals("Spock")) {

            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (player1.equals("Scissor") && player2.equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Scissor") && player2.equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Scissor") && player2.equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Scissor") && player2.equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Scissor") && player2.equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (player1.equals("Lizzard") && player2.equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Lizzard") && player2.equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Lizzard") && player2.equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (player1.equals("Lizzard") && player2.equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Lizzard") && player2.equals("Spock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (player1.equals("Spock") && player2.equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Spock") && player2.equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (player1.equals("Spock") && player2.equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (player1.equals("Spock") && player2.equals("Lizzard")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (player1.equals("Spock") && player2.equals("Spock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
    }
    
    /**
     * Ennek a metódusnak az a feladata hogy kiirja két játékos közül a nyertest.
     */
    public void setWinnerLabel() {
        if (Player.isPlayer1Win() && Player.isPlayer2Win()) {
            lbResult.setText("=");
            lbWinName.setText("Draw");
            logger.info(lbResult.getText()+" "+lbWinName.getText());
        }
        if (Player.isPlayer1Win() && !Player.isPlayer2Win()) {
            lbResult.setText(">");
            lbWinName.setText("Winner: "+Player.getName1());
            logger.info(lbResult.getText()+" "+lbWinName.getText());
        }
        if (!Player.isPlayer1Win() && Player.isPlayer2Win()) {
            lbWinName.setText("Winner: "+Player.getName2());
            lbResult.setText("<");
           
            logger.info(lbResult.getText()+" "+lbWinName.getText());
        }
    }

}
