package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public class SecretNumber {

    private final int number = (int) (Math.random() * 500);

    public SecretNumber() {
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "SecretNumber{" + "number=" + number + '}';
    }
    
}
