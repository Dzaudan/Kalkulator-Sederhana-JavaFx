package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

    @FXML 
    private TextField display; 
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        display.setText("0")
    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            display.setText("");
            start = false;
        }
        // Mengambil teks angka dari tombol yang diklik[cite: 8, 21]
        String value = ((Button) event.getSource()).getText();
        display.setText(display.getText() + value);
    }
}
