/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 04046001232
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private TextField txtResultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 + num2;

        txtResultado.setText(result.toString());
    }

    @FXML
    private void divide(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 / num2;

        txtResultado.setText(result.toString());
    }

    @FXML
    private void menos(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 - num2;

        txtResultado.setText(result.toString());
    }

    @FXML
    private void vezes(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 * num2;

        txtResultado.setText(result.toString());
    }
    
}
