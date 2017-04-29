/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.abstergo.ati.kopapirgyikspock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
    @FXML
    private Button btnGameOver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player1.setText(Player.getName1());
        player2.setText(Player.getName2());
        scorePlayer1.setText(Integer.toString(Player.getPontszam1()));
        scorePlayer2.setText(Integer.toString(Player.getPontszam2()));
        System.out.println(Player.getPontszam1());
    }

    @FXML
    private void setGameOverAction(ActionEvent event) {
        Stage stage;
        Parent root;
        //stage = (Stage)button.getScene().getWindow();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/ResultFXML.fxml"));
            //stage.hide();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(Player2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
