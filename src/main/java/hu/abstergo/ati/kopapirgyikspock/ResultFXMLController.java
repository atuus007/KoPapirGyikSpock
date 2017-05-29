package hu.abstergo.ati.kopapirgyikspock;
//CHECKSTYLE:OFF
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
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
 * Az eredményeket Vezérlő UI.
 * Ez jeleniti meg hogy melyik játékos nyert.
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
    @FXML
    private Label lbWinner;
    private GameRule gameRule;
    @FXML
    private Label lbWinnerName;
     /**
     * Initializes the controller class.
     * @param url Első paraméter amit inicializáláskor kap.
     * @param rb A második paraméter egy objektumcsomag.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbP1.setText(Player.getName1());
        lbP2.setText(Player.getName2());
        gameRule = new GameRule(lbWinner, lbWinnerName);
        // gameRule.rule();
        gameRule.rule(Player.getGuess1(), Player.getGuess2());
        setPictures();
        //valueCleaning();
    }
     /**
     * Ez állitja be a jétékosok válaszait.
     */
    public void setPictures() {

        switch (Player.getGuess1()) {
            case "Rock":
                imgPlayer1.setImage(new Image("/img/rock.png"));
                break;
            case "Paper":
                imgPlayer1.setImage(new Image("/img/paper.png"));
                break;
            case "Scissor":
                imgPlayer1.setImage(new Image("/img/scissor.png"));
                break;
            case "Lizzard":
                imgPlayer1.setImage(new Image("/img/lizzard.png"));
                
                break;
            case "Spock":
                imgPlayer1.setImage(new Image("/img/spock.png"));
                break;
            default:
                break;

        }
        switch (Player.getGuess2()) {
            case "Rock":
                imgPlayer2.setImage(new Image("/img/rock.png"));
                break;
            case "Paper":
                imgPlayer2.setImage(new Image("/img/paper.png"));
                break;
            case "Scissor":
                imgPlayer2.setImage(new Image("/img/scissor.png"));
                break;
            case "Lizzard":
                imgPlayer2.setImage(new Image("/img/lizzard.png"));
                break;
            case "Spock":
                imgPlayer2.setImage(new Image("/img/spock.png"));
                break;
            default:
                break;

        }
        gameRule.setWinnerLabel();
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
                //Logger.getLogger(ResultFXMLController.class.getName()).log(Level.SEVERE, null, ex);
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
                //Logger.getLogger(ResultFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (btnEvent.getId().equals("btnExit")) {
            stage = (Stage) btnExit.getScene().getWindow();
            stage.close();
        }
    }
}
