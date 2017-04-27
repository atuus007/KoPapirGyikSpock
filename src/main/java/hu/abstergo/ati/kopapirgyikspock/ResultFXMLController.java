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
public class ResultFXMLController implements Initializable {

    @FXML
    private Label lbP1;
    @FXML
    private Label lbP2;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbP1.setText(Player.getNev1());
        lbP2.setText(Player.getNev2());
    }    
    
}
