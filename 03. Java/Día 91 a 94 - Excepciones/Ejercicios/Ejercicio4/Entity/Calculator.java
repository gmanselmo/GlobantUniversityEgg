package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Calculator {

    private int number1;
    private int number2;
    private double outcome;

    public Calculator() {
    }

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "Calculator{" + "number1=" + number1 + ", number2=" + number2 + ", outcome=" + outcome + '}';
    }
    
}
