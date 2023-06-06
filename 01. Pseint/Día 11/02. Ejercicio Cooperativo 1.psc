Algoritmo numeros_asteriscos
	
	Definir num, i, j, contador Como Entero
	
	contador = 5
		
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		Mientras (contador <> 0) Hacer
			
			Escribir "Ingrese 5 números enteros naturales entre 1 y 20: "
			
			Leer num
			
			Si (num <= 20) Y (num >= 1) Entonces
				
				Escribir Sin Saltar num
				
				Para j = 1 Hasta num Con Paso 1 Hacer
					
					Escribir Sin Saltar "*"
					
				FinPara
				
				Escribir ""
				
				contador = contador - 1
				
			FinSi
			
		FinMientras
		
	FinPara

FinAlgoritmo
