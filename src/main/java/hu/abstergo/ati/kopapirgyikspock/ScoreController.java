/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Ati
 */
public class ScoreController implements Initializable {

    @FXML
    private Label player1;
    @FXML
    private Label player2;
    @FXML
    private Label scorePlayer1;
    @FXML
    private Label scorePlayer2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      player1.setText(Player.getNev1());
      player2.setText(Player.getNev2());
      scorePlayer1.setText(Integer.toString(Player.getPontszam1()));
      scorePlayer2.setText(Integer.toString(Player.getPontszam2()));
      
    }    
    
}
