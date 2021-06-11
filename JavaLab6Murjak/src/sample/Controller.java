package sample;

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
    private Label calcLabel;

    @FXML
    private Button calcButton;

    @FXML
    private TextField xField;

    @FXML
    private TextField dayField;

    @FXML
    private Button dayButton;

    @FXML
    private Label dayLabel;

    @FXML
    void calcButtonClicked(MouseEvent event) {
        try {
        int x = Integer.parseInt(xField.getText());
        calcLabel.setText("К-сть повних хвилин: " + x/60);
        }
        catch (NumberFormatException e)
        {
            calcLabel.setText("Помилка");
        }
    }

    @FXML
    void dayButtonClicked(MouseEvent event) {
        try {
            int index = Integer.parseInt(dayField.getText());
            switch (index)
            {
                case 1: dayLabel.setText("Балацький"); break;
                case 2: dayLabel.setText("Бодян"); break;
                case 3: dayLabel.setText("Братко"); break;
                case 4: dayLabel.setText("Голуб"); break;
                case 5: dayLabel.setText("Груба"); break;
                case 6: dayLabel.setText("Жлоба"); break;
                case 7: dayLabel.setText("Іванюк"); break;
                case 8: dayLabel.setText("Кочурка"); break;
                case 9: dayLabel.setText("Куранов"); break;
                case 10: dayLabel.setText("Курпа"); break;
                default: dayLabel.setText("Число не підходить"); break;
            }
        }
        catch (NumberFormatException e)
        {
            dayLabel.setText("Помилка");
        }
    }

    @FXML
    void initialize() {


    }
}


