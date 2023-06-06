SubProceso Rellenador(n1, n2, matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta n1 - 1 Con Paso 1 Hacer
		
		Para j = 0 Hasta n2 - 1 Con Paso 1 Hacer
			
			matriz[i, j] = Aleatorio(1, 100)
			
			Escribir sin saltar matriz[i, j], " | "
			
		FinPara
		
		Escribir ""
		
	FinPara	
	
FinSubProceso


SubProceso Transpuesta(n1, n2, matriz Por Referencia, matrizTranspuesta Por Referencia)
	
	Definir i, j Como Entero
	
	Para j = 0 Hasta n2 - 1 Con Paso 1 Hacer
		
		Para i = 0 Hasta n1 - 1 Con Paso 1 Hacer
							
			matrizTranspuesta[j, i] = matriz[i, j]
			
			Escribir sin saltar matriz[i, j], " | "

		FinPara
		
		Escribir ""

	FinPara	
	
FinSubProceso


Algoritmo matriz_transpuesta
	
	Definir matriz, matrizTranspuesta, n1, n2 Como Entero
	
	Escribir "Ingrese los lados de la matriz: "
	
	Leer n1, n2
	
	Dimension matriz[n1, n2], matrizTranspuesta[n2, n1]
	
	Rellenador(n1, n2, matriz)
	
	Transpuesta(n1, n2, matriz, matrizTranspuesta)
	
FinAlgoritmo
