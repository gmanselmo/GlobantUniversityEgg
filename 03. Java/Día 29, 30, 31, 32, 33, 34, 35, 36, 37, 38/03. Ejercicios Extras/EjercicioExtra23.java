package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra23 {
    
    public static void main(String[] args) {
        
        String[][] sopaDeLetras = new String[20][20];
        
        String[] palabras = new String[5];
        
        solicitarPalabras(palabras);

        ubicarPalabras(sopaDeLetras, palabras);

        rellenarSopa(sopaDeLetras);
        
        System.out.println("Sopa de Letras:");
        
        imprimirSopa(sopaDeLetras);
       
    }
    
    public static void rellenarSopa(String[][] sopaDeLetras) {
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                if (sopaDeLetras[i][j] == null) {
                    
                    int aleatorio = (int) (Math.random() * 10);
                    
                    sopaDeLetras[i][j] = String.valueOf(aleatorio);
                    
                }
                
            }
            
        }
        
    }
    
    public static void imprimirSopa(String[][] sopaDeLetras) {
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 20; j++) {
                
                System.out.print(sopaDeLetras[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
    }
    
    public static void ubicarPalabras(String[][] sopaDeLetras, String[] palabras) {
        
        for (int i = 0; i < 5; i++) {
            
            int filaAleatoria = (int) (Math.random() * 20);

            String palabra = palabras[i];
            
            int random;
            
            int largoPalabra = palabra.length();
            
            switch (largoPalabra) {
                case 3:
                    random = (int) (Math.random() * 18);
                    for (int j = 0; j < largoPalabra; j++) {
                        if (sopaDeLetras[filaAleatoria][random + j] != null) {
                            filaAleatoria = (int) (Math.random() * 20);
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        } else {
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        }
                    }
                    break;
                    
                case 4:
                    random = (int) (Math.random() * 17);
                    for (int j = 0; j < largoPalabra; j++) {
                        if (sopaDeLetras[filaAleatoria][random + j] != null) {
                            filaAleatoria = (int) (Math.random() * 20);
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        } else {
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        }
                    }
                    break;
                    
                case 5:
                    random = (int) (Math.random() * 16);
                    for (int j = 0; j < largoPalabra; j++) {
                        if (sopaDeLetras[filaAleatoria][random + j] != null) {
                            filaAleatoria = (int) (Math.random() * 20);
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        } else {
                            sopaDeLetras[filaAleatoria][random + j] = palabra.substring(j, j + 1);
                        }
                    }
                    break;
                    
            }
            
        }
        
    }
    
    public static void solicitarPalabras(String[] palabras) {
        
        for (int i = 0; i < 5; i++) {
            
            String palabra = ingresoComprobado();
            
            palabras[i] = palabra;
            
        }
       
    }
    
    public static String ingresoComprobado() {
        
        Scanner ingreso = new Scanner(System.in);
        
        while (true) {

            System.out.println("Ingrese una palabra de entre 3 y 5 caractéres: ");
            
            String palabra = ingreso.nextLine();
            
            if ((palabra.length() >= 3) && (palabra.length() <= 5)) {

                return palabra;
                
            } else {
                
                System.out.println("Palabra erronea. Debe ser de un largo de 3 a 5 caracteres.");
                
            }
            
        }
        
    }

}
