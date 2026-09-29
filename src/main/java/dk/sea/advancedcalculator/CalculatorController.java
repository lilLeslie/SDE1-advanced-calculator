package dk.sea.advancedcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label lblCalculation;
    @FXML
    private Label lblInput;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnPlusMinus;
    @FXML
    private Button btnPercent;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnSeven;
    @FXML
    private Button btnEight;
    @FXML
    private Button btnNine;
    @FXML
    private Button btnMultiply;
    @FXML
    private Button btnFour;
    @FXML
    private Button btnFive;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnSubtract;
    @FXML
    private Button btnOne;
    @FXML
    private Button btnTwo;
    @FXML
    private Button btnThree;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnComma;
    @FXML
    private Button btnEquals;
    private StringBuilder calculation = new StringBuilder();

    private String operatorClicked = "";
    private int firstNumber;
    private int secondNumber;

    public void initialize(){
        btnZero.getStyleClass().add("btnNumber");
        btnOne.getStyleClass().add("btnNumber");
        btnTwo.getStyleClass().add("btnNumber");
        btnThree.getStyleClass().add("btnNumber");
        btnFour.getStyleClass().add("btnNumber");
        btnFive.getStyleClass().add("btnNumber");
        btnSix.getStyleClass().add("btnNumber");
        btnSeven.getStyleClass().add("btnNumber");
        btnEight.getStyleClass().add("btnNumber");
        btnNine.getStyleClass().add("btnNumber");
        btnComma.getStyleClass().add("btnNumber");

        btnClear.getStyleClass().add("btnOperator");
        btnPlusMinus.getStyleClass().add("btnOperator");
        btnPercent.getStyleClass().add("btnOperator");
        btnDivide.getStyleClass().add("btnOperator");
        btnMultiply.getStyleClass().add("btnOperator");
        btnSubtract.getStyleClass().add("btnOperator");
        btnAdd.getStyleClass().add("btnOperator");
        btnComma.getStyleClass().add("btnNumber");
        btnEquals.getStyleClass().add("btnOperator");
    }

    public void onBtnClearClick(ActionEvent actionEvent) {
        calculation.setLength(0);
        calculation.append("0");
        lblInput.setText(calculation.toString());
        lblCalculation.setText(calculation.toString());
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
    }

    public void onBtnPercentClick(ActionEvent actionEvent) {
    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        onOperatorClick("÷");
    }

    public void onBtnSevenClick(ActionEvent actionEvent) {
        appendToResult("7");
    }

    public void onBtnEightClick(ActionEvent actionEvent) {
        appendToResult("8");
    }

    public void onBtnNineClick(ActionEvent actionEvent) {
        appendToResult("9");
    }

    public void onBtnMultiplyClick(ActionEvent actionEvent) {
        onOperatorClick("×");
    }

    public void onBtnFourClick(ActionEvent actionEvent) {
        appendToResult("4");
    }

    public void onBtnFiveClick(ActionEvent actionEvent) {
        appendToResult("5");
    }

    public void onBtnSixClick(ActionEvent actionEvent) {
        appendToResult("6");
    }

    public void onBtnSubtractClick(ActionEvent actionEvent) {
        onOperatorClick("-");
    }

    public void onBtnOneClick(ActionEvent actionEvent) {
        appendToResult("1");
    }

    public void onBtnTwoClick(ActionEvent actionEvent) {
        appendToResult("2");
    }

    public void onBtnThreeClick(ActionEvent actionEvent) {
        appendToResult("3");
    }

    public void onBtnAddClick(ActionEvent actionEvent) {
        onOperatorClick("+");
    }

    public void onBtnZeroClick(ActionEvent actionEvent) {
        appendToResult("0");
    }

    public void onBtnCommaClick(ActionEvent actionEvent) {
    }

    public void onBtnEqualsClick(ActionEvent actionEvent) {
        if (!operatorClicked.isEmpty()) {
            int result = 0;
            secondNumber = Integer.parseInt(lblInput.getText());
            switch (operatorClicked) {
                case "÷":
                    result = firstNumber / secondNumber;
                    break;
                case "×":
                    result = firstNumber * secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "+":
                    result = firstNumber + secondNumber;
            }
            calculation.append("=").append(result);
            lblCalculation.setText(calculation.toString());
            lblInput.setText(result + "");
        }
    }

    private void appendToResult(String number) {
        if (lblInput.getText().equals("0")) {
            calculation.setLength(0);
            calculation.append(number);
            lblInput.setText(calculation.toString());

        } else if (!operatorClicked.isEmpty()) {
            lblInput.setText(number);
            calculation.append(number);
        } else {
            calculation.append(number);
            lblInput.setText(calculation.toString());
        }
    }

    private void onOperatorClick(String symbol) {
        if (!calculation.toString().equals("0")) {
            firstNumber = Integer.parseInt(calculation.toString());
            calculation.append(symbol);
            lblCalculation.setText(calculation.toString());
            operatorClicked = symbol;
        }
    }
}
