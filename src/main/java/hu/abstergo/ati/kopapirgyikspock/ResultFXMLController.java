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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ati
 */
public class ResultFXMLController implements Initializable {

    @FXML
    private Label lbP1;
    @FXML
    private Label lbP2;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnSocre;
    @FXML
    private Button btnExit;
    @FXML
    private ImageView imgPlayer1;
    @FXML
    private ImageView imgPlayer2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbP1.setText(Player.getName1());
        lbP2.setText(Player.getName2());
        rule();
        setPictures();
        valueCleaning();
    }
    public void setPictures(){
       
        switch(Player.getGuess1()){
            case "Rock": imgPlayer1.setImage(new Image("/img/rock.png")); break;
            case "Paper": imgPlayer1.setImage(new Image("/img/paper.png")); break;
            case "Scissor": imgPlayer1.setImage(new Image("/img/scissor.png")); break;
            case "Lizzard": System.out.println("asdf"); break;
            case "Spock": imgPlayer1.setImage(new Image("/img/spock.png")); break;
            default:break;
            
          
        }
        switch(Player.getGuess2()){
            case "Rock": imgPlayer2.setImage(new Image("/img/rock.png")); break;
            case "Paper": imgPlayer2.setImage(new Image("/img/paper.png")); break;
            case "Scissor": imgPlayer2.setImage(new Image("/img/scissor.png")); break;
            case "Lizzard": System.out.println("asdf"); break;
            case "Spock": imgPlayer2.setImage(new Image("/img/spock.png")); break;
            default:break;
            
          
        }
    }
    
    public void rule() {
        System.out.println(Player.getGuess1() + " " + Player.getGuess2());

        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Rock") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        //////////////////////////////////////////////////

        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Lizzard")) {

            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Paper") && Player.getGuess2().equals("Spock")) {

            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Scissor") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        //////////////////////////////////////////////////////////////6
        /////////////////////////////////////////////////////////////////
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam2(Player.getPontszam2() + 1);

        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Lizzard") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Rock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Paper")) {
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Scissor")) {
            Player.setPontszam1(Player.getPontszam1() + 1);

        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Lizzard")) {
            Player.setPontszam2(Player.getPontszam2() + 1);

        }
        if (Player.getGuess1().equals("Spock") && Player.getGuess2().equals("Spock")) {
            Player.setPontszam1(Player.getPontszam1() + 1);
            Player.setPontszam2(Player.getPontszam2() + 1);
        }
    }

    private void valueCleaning() {
        Player.setGuess1("");
        Player.setGuess2("");
    }

    @FXML
    private void setOnResultAction(ActionEvent event) {
        Button btnEvent = (Button) event.getSource();
        Parent root;
        Stage stage;
        if (btnEvent.getId().equals("btnNext")) {

            //stage = (Stage)button.getScene().getWindow();
            try {

                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("/fxml/Player1.fxml"));
                //stage.hide();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ResultFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (btnEvent.getId().equals("btnSocre")) {

            try {
                //Parent root;
                //Stage stage;
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("/fxml/Score.fxml"));
                //stage.hide();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ResultFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (btnEvent.getId().equals("btnExit")) {
            stage = (Stage) btnExit.getScene().getWindow();
            stage.close();
        }
    }
}
