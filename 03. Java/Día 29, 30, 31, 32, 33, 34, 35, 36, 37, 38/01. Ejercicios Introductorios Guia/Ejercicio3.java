package JavaIntro;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int aritmeticos, unarios; 
        boolean relacion;
        
        aritmeticos = 14 / 15 + 18;
        System.out.println(aritmeticos);
        
        aritmeticos = 15 + 25 * 8;
        System.out.println(aritmeticos);
        
        unarios = 25;
        ++unarios;
        System.out.println(unarios);
        
        --unarios;
        System.out.println(unarios);
        
        relacion = 15 > 25;
        System.out.println(relacion);
        
        relacion = 12 != 25;
        System.out.println(relacion);
 
    }
}
