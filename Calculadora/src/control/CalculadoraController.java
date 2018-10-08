/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Calculo;

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
        salvar("+");
    }

    @FXML
    private void divide(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 / num2;

        txtResultado.setText(result.toString());
        salvar("/");
    }

    @FXML
    private void menos(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 - num2;

        txtResultado.setText(result.toString());
        salvar("-");
    }

    @FXML
    private void vezes(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());

        Double  result;

        result = num1 * num2;

        txtResultado.setText(result.toString());
        salvar("*");
    }
    private void salvar(String operacao) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager  em = emf.createEntityManager();
            Calculo calculadora;
            Calculo calculo = new Calculo();
            calculo.setN1(txtN1.getText());
            calculo.setN2(txtN2.getText());
            calculo.setOperacao(operacao);
            em.getTransaction().begin();
            em.persist(calculo);
            em.getTransaction().commit();
            
            
        }
    }
    

