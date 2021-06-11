package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button monthButton;

    @FXML
    private TextField x1;

    @FXML
    private TextField y1;

    @FXML
    private TextField x2;

    @FXML
    private TextField y2;

    @FXML
    private Label labelRes;

    @FXML
    void ChangeButtonClick(MouseEvent event) {
        if (x1.getText() != "" && y1.getText() != "" && x2.getText() != ""&& y2.getText()!="")
        labelRes.setText("AB = " + Math.sqrt(Math.pow(Integer.parseInt(x2.getText()) - Integer.parseInt(x1.getText()), 2) + Math.pow(Integer.parseInt(y2.getText())-Integer.parseInt(y1.getText()),2)));
    }
}
