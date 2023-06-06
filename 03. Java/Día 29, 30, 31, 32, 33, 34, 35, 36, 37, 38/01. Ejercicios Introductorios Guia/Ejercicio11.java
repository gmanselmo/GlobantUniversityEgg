package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase a codificar:");
        
        String frase = input.nextLine();
        
        String convertida = conversora(frase);
        
        System.out.println(convertida);
  
    }
    
    public static String conversora (String frase){
        
        String convertida = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            char letra = frase.charAt(i);
            
            switch (Character.toLowerCase(letra)) {
                
                case 'a':
                    
                    letra = '@';
                    
                    break;
                    
                case 'e':
                    
                    letra = '#';

                    break;
                    
                case 'i':
                    
                    letra = '$';
                    
                    break;
                    
                case 'o':
                    
                    letra = '%';
                    
                    break;
                    
                case 'u':
                    
                    letra = '*';

                    break;
                    
                default:
                    
                    break;

            }
            
            convertida = convertida.concat(String.valueOf(letra));
            
        }
        
        return convertida;
        
    }
}
