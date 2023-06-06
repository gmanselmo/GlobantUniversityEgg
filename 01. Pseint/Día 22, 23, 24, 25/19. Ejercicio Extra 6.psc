SubProceso RellenadorMatriz(matriz Por Referencia)
	
	Definir i, j, contador Como Entero
	
	contador = 1
	
	Mientras (contador <= 9) Hacer
		
		Para i = 0 Hasta 2 Con Paso 1 Hacer
			
			Para j = 0 Hasta 2 Con Paso 1 Hacer
				
				Escribir Sin Saltar "| "
				
				matriz[i, j] = contador
				
				contador  = contador + 1	
				
				Escribir Sin Saltar matriz[i, j], " "
				
			FinPara
			
			Escribir Sin Saltar "|"
			
			Escribir ""
			
		FinPara	
		
	FinMientras
	
FinSubProceso


SubProceso RellenadorVector (vector Por Referencia) 
	
	Definir i Como Entero
	
	Escribir Sin Saltar "| "
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		
		vector[i] = i + 1
		
		Escribir Sin Saltar vector[i], " | "
		
	FinPara

	
	Escribir ""
	
FinSubProceso


Algoritmo matriz_por_vector
	
	Definir matriz, vector, vectorFinal, i, j, resultado Como Entero
	
	Dimension matriz[3, 3], vector[3], vectorFinal[3]
	
	resultado = 0
	
	Escribir "Matriz:"
	
	RellenadorMatriz(matriz)
	
	Escribir ""
	
	Escribir "Vector:"
	
	RellenadorVector(vector)
	
	Escribir ""
		
	Escribir "El resultado de la multiplicación de ambos es:"
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		
		Escribir Sin Saltar "| "
		
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			
			resultado = resultado + matriz[i, j] * vector[j]
						
		FinPara
		
		vectorFinal[i] = resultado
		
		Escribir vectorFinal[i], " | "
		
		resultado = 0
	
	FinPara
	
FinAlgoritmo
