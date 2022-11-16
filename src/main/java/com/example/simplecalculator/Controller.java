import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private Label output;

    @FXML
    void calculateAddition(ActionEvent event){

        Double number1 = Double.parseDouble(input1.getText());
        Double number2 = Double.parseDouble(input2.getText());
        output.setText(String.valueOf(number1+number2));
    }

    @FXML
    void calculateSubstraction(ActionEvent event){

        Double number1 = Double.parseDouble(input1.getText());
        Double number2 = Double.parseDouble(input2.getText());
        output.setText(String.valueOf(number1-number2));
    }

    @FXML
    void calculateMultiplication(ActionEvent event){

        Double number1 = Double.parseDouble(input1.getText());
        Double number2 = Double.parseDouble(input2.getText());
        output.setText(String.valueOf(number1*number2));
    }

    @FXML
    void calculateDivision(ActionEvent event){

        Double number1 = Double.parseDouble(input1.getText());
        Double number2 = Double.parseDouble(input2.getText());
        output.setText(String.valueOf(number1/number2));

    }

    @FXML
    void calculateSin(ActionEvent event){

        try{
            Double number = Double.parseDouble(input1.getText());
            Double number1 = Math.toRadians(number);
            Double sinValue = Math.sin(number1);
            output.setText(String.valueOf(sinValue));
        }

        catch (Exception e) {
            output.setText("Use Input Number 1");
        }

    }


    @FXML
    void calculateCos(ActionEvent event){

        try{
            Double number = Double.parseDouble(input1.getText());
            Double number1 = Math.toRadians(number);
            Double cosValue = Math.cos(number1);
            output.setText(String.valueOf(cosValue));
        }
        catch (Exception e) {
            output.setText("Use Input Number 1");
        }

    }


    @FXML
    void calculateTan(ActionEvent event){

        try{
            Double number = Double.parseDouble(input1.getText());
            Double number1 = Math.toRadians(number);
            Double tanValue = Math.tan(number1);
            output.setText(String.valueOf(tanValue));
        }
        catch (Exception e) {
            output.setText("Use Input Number 1");
        }

    }



    @FXML
    void calculateExp(ActionEvent event){

        try{
            Double number = Double.parseDouble(input1.getText());
            Double ExpValue = Math.exp(number);
            output.setText(String.valueOf(ExpValue));
        }
        catch (Exception e) {
            output.setText("Use Input Number 1");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
