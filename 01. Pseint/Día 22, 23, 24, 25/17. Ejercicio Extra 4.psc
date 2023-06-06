SubProceso Rellenador(matriz Por Referencia)
	
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


SubProceso Multiplicador (matrizA Por Referencia, matrizB Por Referencia, matrizC Por Referencia)
	
	Definir i, j, k, contador Como Entero
	
	contador = 0
	
	Para i = 0 Hasta 2 Hacer
		
        Para j = 0 Hasta 2 Hacer
			
            matrizC[i, j] = 0
			
            Para k <- 0 Hasta 2 Hacer
				
                matrizC[i, j] = matrizC[i, j] + matrizA[i, k] * matrizB[k, j]
				
            Fin Para
			
        Fin Para
		
    Fin Para
	
FinSubProceso


SubProceso Imprimidor(matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		
		Escribir Sin Saltar "| "
		
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			
			Escribir sin saltar matriz[i, j], " | "
			
		FinPara
		
		Escribir ""
		
	FinPara	
	
FinSubProceso


Algoritmo matriz_multiplicada
	
	Definir matrizA, matrizB, matrizC Como Entero
	
	Dimension matrizA[3, 3], matrizB[3, 3], matrizC[3, 3]
	
	Rellenador(matrizA)
	
	Escribir ""
	
	Rellenador(matrizB)
	
	Escribir ""
	
	Multiplicador(matrizA, matrizB, matrizC)
	
	Imprimidor(matrizC)
	
FinAlgoritmo
