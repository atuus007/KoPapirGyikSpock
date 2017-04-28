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
public class Player2Controller implements Initializable {

    @FXML
    private Button btnRock;
    @FXML
    private Button btnPaper;
    @FXML
    private Button btnOllo;
    @FXML
    private Button btnLizzard;
    @FXML
    private Button btnSpock;
    @FXML
    private Label lbPlayerName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbPlayerName.setText(Player.getNev2());
      

    }

    @FXML
    private void setOnAction(ActionEvent event) {
        Button btn = (Button)event.getSource();
       String asd="";
        switch(btn.getId()){
            case "btnRock": Player.setValasz2("Kő"); break;
            case "btnPaper": Player.setValasz2("Papír"); break;
            case "btnOllo": Player.setValasz2("Olló"); break;
            case "btnLizzard": Player.setValasz2("Gyík"); break;
            case "btnSpock": Player.setValasz2("Spock"); break;
            default:break;
            
          
        }
       
        System.out.println(Player.getValasz2());
        
        
        
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
