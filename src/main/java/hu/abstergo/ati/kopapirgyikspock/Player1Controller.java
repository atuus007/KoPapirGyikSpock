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
 * Az első játékoshoz tartozó UI.
 * @author Ati
 */
public class Player1Controller implements Initializable {

    
    @FXML
    private Button btnRock;
    @FXML
    private Button btnPaper;
    @FXML
    private Button btnOllo;
    @FXML
    private Button btnLizard;
    @FXML
    private Button btnSpock;
    @FXML
    private Label lbPlayerName;
    
    private String valasz;
    @FXML
    private ImageView imgPlayer1;
    private static  final org.slf4j.Logger logger = LoggerFactory.getLogger(Player1Controller.class);
    /**
     * Initializes the controller class.
     * @param url Első paraméter amit inicializáláskor kap.
     * @param rb A második paraméter egy objektumcsomag.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           lbPlayerName.setText(Player.getName1());
           logger.info("Player1 Start");
    }   

    @FXML
    private void setOnAction(ActionEvent event) {
        Button btn = (Button)event.getSource();
        Image img;
        switch(btn.getId()){
            case "btnRock": Player.setGuess1("Rock"); break;
            case "btnPaper": Player.setGuess1("Paper"); break;
            case "btnOllo": Player.setGuess1("Scissor"); break;
            case "btnLizard": Player.setGuess1("Lizzard"); break;
            case "btnSpock": Player.setGuess1("Spock"); break;
            default:break;
            
          
        }
        
        
        logger.info(Player.getGuess1());
        
        
        
        
        Stage stage;
        Parent root;
        stage = (Stage)btn.getScene().getWindow();
        //stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/Player2.fxml"));
            stage.hide();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            //Logger.getLogger(Player2Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
