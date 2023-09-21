package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public class NumberDivision {

    private Integer number1;
    private Integer number2;
    private double outcome;

    public NumberDivision() {
    }

    public NumberDivision(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
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
        return "NumberDivision{" + "number1=" + number1 + ", number2=" + number2 + ", outcome=" + outcome + '}';
    }

}
