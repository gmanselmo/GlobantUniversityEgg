package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Matematica {
    
    private Double num1;
    private Double num2;
    
    public Matematica(){
    }
    
    public Matematica(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

}
