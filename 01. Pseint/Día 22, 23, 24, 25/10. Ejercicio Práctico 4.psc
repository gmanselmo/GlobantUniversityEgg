SubProceso completarMatrizCuadada(x1, y1, matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta x1 - 1 Con Paso 1 Hacer
		Para j = 0 Hasta y1 - 1 Con Paso 1 Hacer
			Si (i == j) Entonces
				matriz[i, j] = 0
			SiNo
				matriz[i, j] = Aleatorio(1, 99)	
			FinSi
		FinPara
	FinPara
	
FinSubProceso


SubProceso imprimirMatriz(x1, y1, matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Escribir "La matriz es:"
	
	Para i = 0 Hasta x1 - 1 Con Paso 1 Hacer
		Para j = 0 Hasta y1 - 1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso


Algoritmo matriz_diagonal_principal
	
	Definir x1, y1, matriz Como Entero
	
	x1 = 5
	y1 = 5
	
	Dimension matriz[x1, y1]
	
	completarMatrizCuadada(x1, y1, matriz)
	
	imprimirMatriz(x1, y1, matriz)
	
FinAlgoritmo
