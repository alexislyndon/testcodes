
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ChildController implements Initializable {

    @FXML
    private Button btnone;
    @FXML
    private Button btntwo;
    @FXML
    private Button btnthree;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void one(ActionEvent event) {
        int chosennumber = 1;
        Stage stage = (Stage) btnone.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void two(ActionEvent event) {
        int chosennumber = 2;
        Stage stage = (Stage) btntwo.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void three(ActionEvent event) {
        int chosennumber = 3;
        Stage stage = (Stage) btnthree.getScene().getWindow();
        stage.close();
    }
    
}
