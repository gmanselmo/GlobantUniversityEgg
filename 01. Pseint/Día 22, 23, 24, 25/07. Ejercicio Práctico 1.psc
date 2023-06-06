SubProceso completarMatriz (matriz Por Referencia)
	
	Definir ingreso, i, j Como Entero
	
	Escribir "Ingrese un entero por cada elemento de la matriz: "
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[", i, ",", j, "]"
			Leer ingreso
			matriz[i, j] = ingreso
		FinPara
	FinPara
	
	Limpiar Pantalla
	
FinSubProceso


SubProceso imprimirMatriz (matriz Por Referencia)
	
	Definir i, j Como Entero

	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir""
	FinPara

FinSubProceso


Algoritmo rellenador_matriz
	
	Definir matriz Como Entero
	
	Dimension matriz[3, 3]
	
	completarMatriz(matriz)
	
	imprimirMatriz(matriz)
	
FinAlgoritmo
