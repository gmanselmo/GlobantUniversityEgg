package ejercicios.de.aprendizaje;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        int n = 5;
        
        int[] vector = new int[n];
        
        int[] cantidades = new int[5];
                
        Rellenador(vector, n, cantidades);
        
        contadorDigitos(vector, n, cantidades);
        
        mostrarRepetidos(cantidades);

    }
    
    public static void Rellenador(int[] vector, int n, int[] cantidades) {
        
        for (int i = 0; i < n; i++) {
            
            vector[i] = (int) (Math.random() * 99999) + 1;

        }
        
        for (int i = 0; i < 5; i++) {
            
            cantidades[i] = 0;

        }
        
    }
    
    public static void contadorDigitos(int[] vector, int n, int[] cantidades) {
        
        int dato = 0;
        
        for (int i = 0; i < n; i++) {
            
            int datoVector = vector[i];
            
            String numero = String.valueOf(datoVector);
            
            int largo = numero.length();
            
            if (largo == 1) {
                
                dato = cantidades[0] + 1;
                
                cantidades[0] = dato;
   
            } else if (largo == 2) {
                
                dato = cantidades[1] + 1;
                
                cantidades[1] = dato;
   
            } else if (largo == 3) {
                
                dato = cantidades[2] + 1;
                
                cantidades[2] = dato;
   
            } else if (largo == 4) {
                
                dato = cantidades[3] + 1;
                
                cantidades[3] = dato;
   
            } else {

                dato = cantidades[4] + 1;
                
                cantidades[4] = dato;

            }
            
        }
        
    }
    
    public static void mostrarRepetidos(int[] cantidades) {
        
        for (int i = 0; i < 5; i++ ){
            
            System.out.println("Los nùmeros de " + (i + 1) + " cifras aparecen " + cantidades[i] + " veces.");
            
        }
        
    }
    
}
