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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    private Player player1, player2;
    @FXML
    private Button button;
    @FXML
    private Label label1;
    @FXML
    private TextField tfPlayer2;
    @FXML
    private TextField tfPlayer1;
    @FXML
    private Button btnExit;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if (!(tfPlayer1.getText().isEmpty()) && !(tfPlayer2.getText().isEmpty())) {
            Player.setName1(tfPlayer1.getText());
            Player.setName2(tfPlayer2.getText());
            Parent root;
            Stage stage;
            //stage = (Stage)button.getScene().getWindow();

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/fxml/Player1.fxml"));
            //stage.hide();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
        
            
        }
        /*Parent player1 = FXMLLoader.load(getClass().getResource("/fxml/Player1.fxml"));
       Scene player1_scene=new Scene(player1);
       Stage player1_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       player1_stage.hide();
       player1_stage.setScene(player1_scene);
       player1_stage.show();*/

 /* */
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onAppExit(ActionEvent event) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}
