package hu.abstergo.ati.kopapirgyikspock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private void handleButtonAction(ActionEvent event) {
       player1=new Player(tfPlayer1.getText());
       player2=new Player(tfPlayer2.getText());
       for(int i=0;i<4; i++){
           player1.setPontszam(player1.getPontszam()+1);
       }
       System.out.println(player1.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
