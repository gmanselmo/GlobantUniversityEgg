Algoritmo numeros_asteriscos
	
	Definir num, i, j, contador Como Entero
	
	Definir frase Como Caracter
	
	contador = 5
		
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		Mientras (contador <> 0) Hacer
			
			Escribir "Ingrese 5 números enteros naturales entre 1 y 20: "
			
			Leer num
			
			Si (num <= 20) Y (num >= 1) Entonces
				
				frase = ConvertirATexto(num)
								
				Para j = 1 Hasta num Con Paso 1 Hacer
					
					frase = frase + "*"

				FinPara

				contador = contador - 1
				
			FinSi
			
			Escribir frase
			
		FinMientras
		
	FinPara

FinAlgoritmo
