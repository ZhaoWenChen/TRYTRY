package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML
    private Button btnGo;
    public GridPane body;
    @FXML
    protected void btnGoClicked(ActionEvent event)
    {
        btnGo.setText("Hello");
    }
}
