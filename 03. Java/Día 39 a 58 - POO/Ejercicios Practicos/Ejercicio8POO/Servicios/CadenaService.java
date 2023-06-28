package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CadenaService {
    
    Cadena cadena = new Cadena();
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarDatos() {
        
        System.out.println("Ingrese una frase:");
        
        cadena.setFrase(ingreso.nextLine());
        
        cadena.setLongitud(cadena.getFrase().length());
        
    }
    
    public void mostrarVocales() {
        
        int vocales = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            String letra = cadena.getFrase().substring(i, i + 1).toLowerCase();
            
            switch (letra) {
                case "a":
                    ++vocales;
                    break;
                case "e":
                    ++vocales;
                    break;
                case "i":
                    ++vocales;
                    break;
                case "o":
                    ++vocales;
                    break;
                case "u":
                    ++vocales;
                    break;   
                default:
                    break;
            }
            
        }
        
        System.out.println("La cadena cuenta con " + vocales + " vocales." );
    }
    
    public void invertirFrase() {
        
        StringBuilder invertida = new StringBuilder(cadena.getFrase());
        
        invertida.reverse().toString();
        
        System.out.println("La frase invertida es: " + invertida);
    }
    
    public void vecesRepetido(String letra) {
        
        int contador = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                
                ++contador;
            
            }
            
        }
        
        System.out.println("Entrada: frase = \"" + cadena.getFrase() + "\". Salida: El carácter '" + letra + "' se repite " + contador + " veces.");
        
    }
    
    public void compararLongitud(String frase) {
        
        int contadorCadena = cadena.getLongitud();
        
        int contadorFrase = frase.length();
        
        System.out.println("La frase ingresada tiene " + contadorFrase + " caracteres, mientras que la frase original tiene " + contadorCadena + " caracteres.");
        
    }
    
    public void unirFrases(String frase) {
        
        System.out.println("La unión entre ambas frases es: " + cadena.getFrase() + " " + frase);
        
    }
    
    public void reemplazar(String letra) {
        
        String cambiada = cadena.getFrase().replaceAll("a", letra);
        
        System.out.println("Si reemplazamos todas las letras \"a\" de la frase con la letra " + letra + ", la frase queda así: " + cambiada + ".");
        
    }
    
    public boolean contiene(String letra) {
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                
                return true; 
                
            }
                
        }
            
        return false;
  
    }

}
