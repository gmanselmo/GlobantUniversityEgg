SubProceso llenarMatriz(x1, y1, matriz Por Referencia)
	
	Limpiar Pantalla
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta x1 - 1 Con Paso 1 Hacer
		Para j = 0 Hasta y1 - 1 Con Paso 1 Hacer
			matriz[i, j] = Aleatorio(1, 99)
		FinPara
	FinPara
	
	Escribir "La matriz es:"
	
	Para i = 0 Hasta x1 - 1 Con Paso 1 Hacer
		Para j = 0 Hasta y1 - 1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara	

FinSubProceso


SubProceso calcularMatriz(x1, y1, matriz Por Referencia)
	
	Definir i, j, suma Como Entero
	
	suma = 0
	
	Para i = 0 Hasta x1 - 1 Con Paso 1 Hacer
		Para j = 0 Hasta y1 - 1 Con Paso 1 Hacer
			suma = suma + matriz[i, j]
		FinPara
	FinPara
	
	Escribir ""
	
	Escribir "La suma de todos los elementos de la matriz es: ", suma, "."
	
FinSubProceso


Algoritmo matriz_calculada
	
	Definir x1, y1, matriz Como Entero
	
	Escribir "Ingrese la cardinalidad de la matriz (cantidad de filas y columnas: "
	
	Leer x1, y1
	
	Dimension matriz[x1, y1]
	
	llenarMatriz(x1, y1, matriz)
	
	calcularMatriz(x1, y1, matriz)
	
FinAlgoritmo
