package dk.sea.advancedcalculator.models;

public class CalculatorLogic {
    private double currentValue;
    private double savedValue; // number saved when operator is pressed
    private String input = "0";
    private String calculation = "";
    private String pendingOperator = "";
    private double lastResult; // result of last calculation
    private boolean isTypingNewNumber = true;
    private boolean hasDecimal = false;

    public void setCurrentValue(int number) {
        this.currentValue = number;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public void setSavedValue(double number) {
        this.savedValue = number;
    }

    public double getSavedValue() {
        return this.savedValue;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return this.input;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getCalculation(){
        return calculation;
    }

    public void setOperator(String symbol) {
        this.pendingOperator = symbol;
    }

    public String getOperator() {
        return this.pendingOperator;
    }

    public void setLastResult(int number) {
        this.lastResult = number;
    }

    public double getLastResult() {
        return this.lastResult;
    }

    public void setIsTypingNewNumber(boolean bool) {
        this.isTypingNewNumber = bool;
    }

    public boolean getIsTypingNewNumber() {
        return this.isTypingNewNumber;
    }

    public void clear() {
        this.currentValue = 0;
        this.savedValue = 0;
        this.input = "0";
        this.calculation = "";
        this.pendingOperator = "";
        this.lastResult = 0;
        isTypingNewNumber = true;
    }

    public void handleDigitInput(String digit) {
        if (isTypingNewNumber) {
            input = digit;
            isTypingNewNumber = false;
        } else {
            input += digit;
        }
        calculation += digit;
        currentValue = Double.parseDouble(input);
    }

    public void applyOperator(String operator) {
        pendingOperator = operator;
        savedValue = currentValue;
        calculation += operator;
        currentValue = 0;
        isTypingNewNumber = true;
    }

    public void handlePlusMinus() {
        currentValue *= -1;
    }

    public void calculate() {
        if (!pendingOperator.isEmpty() && !isTypingNewNumber) {
            switch (pendingOperator) {
                case "÷":
                    lastResult = savedValue / currentValue;
                    if (savedValue % currentValue != 0) {
                        hasDecimal = true;
                    }
                    break;
                case "×":
                    lastResult = savedValue * currentValue;
                    break;
                case "-":
                    lastResult = savedValue - currentValue;
                    break;
                case "+":
                    lastResult = savedValue + currentValue;
                    break;
            }
            input = lastResult + "";
            calculation += "=";
            if (!hasDecimal) {
                input = input.split("\\.")[0];
            }

            isTypingNewNumber = true;
        } else return;
    }
}
