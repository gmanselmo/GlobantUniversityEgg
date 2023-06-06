SubProceso Rellenador(dimensionMatriz, matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta dimensionMatriz - 1 Con Paso 1 Hacer
		
		Para j = 0 Hasta dimensionMatriz - 1 Con Paso 1 Hacer
		
			matriz[i, j] = Aleatorio(1, 100)
			
		FinPara
				
	FinPara	
	
FinSubProceso


SubProceso Imprimidor(dimensionMatriz, matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta dimensionMatriz - 1 Con Paso 1 Hacer
		
		Para j = 0 Hasta dimensionMatriz - 1 Con Paso 1 Hacer
		
			Escribir sin saltar matriz[i, j], " | "
			
		FinPara
		
		Escribir ""
		
	FinPara	
	
FinSubProceso


Algoritmo numeros_aleatorios
	
	Definir dimensionMatriz, matriz Como Entero
	
	dimensionMatriz = 5
	
	Dimension matriz[dimensionMatriz, dimensionMatriz]
	
	Rellenador(dimensionMatriz, matriz)
	
	Imprimidor(dimensionMatriz, matriz)
	
FinAlgoritmo
