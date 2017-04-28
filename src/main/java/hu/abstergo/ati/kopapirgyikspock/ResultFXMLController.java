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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lbP1.setText(Player.getNev1());
        lbP2.setText(Player.getNev2());
        rule();
        valueCleaning();
    }

    public void rule() {
        System.out.println(Player.getValast1() + " " + Player.getValasz2());
        if (!(Player.getValast1().equals(""))) {
            if (Player.getValast1().equals("Kő") && (Player.getValasz2().equals("Olló") || Player.getValasz2().equals("Gyík"))) {
                Player.setPontszam1(Player.getPontszam1() + 1);
            }
            if (Player.getValast1().equals("Papír") && (Player.getValasz2().equals("Kő") || Player.getValasz2().equals("Spock"))) {
                Player.setPontszam1(Player.getPontszam1() + 1);
            }
            if (Player.getValast1().equals("Olló") && (Player.getValasz2().equals("Papír") || Player.getValasz2().equals("Gyík"))) {
                Player.setPontszam1(Player.getPontszam1() + 1);
            }
            if (Player.getValast1().equals("Gyík") && (Player.getValasz2().equals("Papír") || Player.getValasz2().equals("Spock"))) {
                Player.setPontszam1(Player.getPontszam1() + 1);
            }
            if (Player.getValast1().equals("Spock") && (Player.getValasz2().equals("Olló") || Player.getValasz2().equals("Kő"))) {
                Player.setPontszam1(Player.getPontszam1() + 1);
            }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////6
            if (Player.getValasz2().equals("Kő") && (Player.getValast1().equals("Olló") || Player.getValast1().equals("Gyík"))) {
                Player.setPontszam2(Player.getPontszam2() + 1);
            }
            if (Player.getValasz2().equals("Papír") && (Player.getValast1().equals("Kő") || Player.getValast1().equals("Spock"))) {
                Player.setPontszam2(Player.getPontszam2() + 1);
            }
            if (Player.getValasz2().equals("Olló") && (Player.getValast1().equals("Papír") || Player.getValast1().equals("Gyík"))) {
                Player.setPontszam2(Player.getPontszam2() + 1);
            }
            if (Player.getValasz2().equals("Gyík") && (Player.getValast1().equals("Papír") || Player.getValast1().equals("Spock"))) {
                Player.setPontszam2(Player.getPontszam2() + 1);
            }
            if (Player.getValasz2().equals("Spock") && (Player.getValast1().equals("Olló") || Player.getValast1().equals("Kő"))) {
                Player.setPontszam2(Player.getPontszam2() + 1);
            }

            if (Player.getValast1().equals(Player.getValasz2())/*||Player.getValasz2().equals(Player.getValast1())*/) {
                Player.setPontszam1(Player.getPontszam1() + 1);
                Player.setPontszam2(Player.getPontszam2() + 1);
            }
        }

    }

    private void valueCleaning() {
        Player.setValast1("");
        Player.setValasz2("");
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
