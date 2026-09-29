package dk.sea.advancedcalculator;

import dk.sea.advancedcalculator.models.CalculatorLogic;
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
    CalculatorLogic cLogic = new CalculatorLogic();

    public void initialize() {
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
        cLogic.clear();
        updateLblInput();
        updateLblCalculation();
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
        cLogic.handlePlusMinus();
        updateLblInput();
        updateLblCalculation();
    }

    public void onBtnPercentClick(ActionEvent actionEvent) {
    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        cLogic.applyOperator("÷");
        updateLblCalculation();
    }

    public void onBtnSevenClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("7");
        updateLblInput();
    }

    public void onBtnEightClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("8");
        updateLblInput();
    }

    public void onBtnNineClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("9");
        updateLblInput();
    }

    public void onBtnMultiplyClick(ActionEvent actionEvent) {
        cLogic.applyOperator("×");
        updateLblCalculation();
    }

    public void onBtnFourClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("4");
        updateLblInput();
    }

    public void onBtnFiveClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("5");
        updateLblInput();
    }

    public void onBtnSixClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("6");
        updateLblInput();
    }

    public void onBtnSubtractClick(ActionEvent actionEvent) {
        cLogic.applyOperator("-");
        updateLblCalculation();
    }

    public void onBtnOneClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("1");
        updateLblInput();
    }

    public void onBtnTwoClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("2");
        updateLblInput();
    }

    public void onBtnThreeClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("3");
        updateLblInput();
    }

    public void onBtnAddClick(ActionEvent actionEvent) {
        cLogic.applyOperator("+");
        updateLblCalculation();
    }

    public void onBtnZeroClick(ActionEvent actionEvent) {
        cLogic.handleDigitInput("0");
        updateLblInput();
    }

    public void onBtnCommaClick(ActionEvent actionEvent) {
    }

    public void onBtnEqualsClick(ActionEvent actionEvent) {
        cLogic.calculate();
        updateLblInput();
        updateLblCalculation();
    }

    public void updateLblInput(){
        lblInput.setText(cLogic.getInput());
    }

    public void updateLblCalculation(){
        lblCalculation.setText(cLogic.getCalculation());
    }
}
