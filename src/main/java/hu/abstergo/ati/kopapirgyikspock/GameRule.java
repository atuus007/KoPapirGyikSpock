/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

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
     * Azt dönti el játékosok alapán hogy melyik játékos kap pontot és hogy melyik játékos nyeri az aktuális kört.
     */
    public void rule() {

        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Spock")) {

            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }

        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());
        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPlayer1Win(true);
            Player.setPlayer2Win(false);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPlayer1Win(false);
            Player.setPlayer2Win(true);
            logger.info(Player.isPlayer1Win() + " " + Player.isPlayer2Win());

        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Spock")) {
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
