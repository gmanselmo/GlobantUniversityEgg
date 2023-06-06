Algoritmo cadena_inversa

	Definir i, largo, vuelta Como Entero
	Definir frase, inversa, nueva Como Caracter
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	inversa = ""
	
	vuelta = 0
	
	largo = Longitud(frase) - 1
	
	Para i = largo Hasta 0 Con Paso -1 Hacer
		
		nueva = Subcadena(frase, i, i)
		
		inversa = inversa + " " + nueva
				
		vuelta = vuelta + 1
		
	FinPara
	
	Escribir inversa
	
FinAlgoritmo
