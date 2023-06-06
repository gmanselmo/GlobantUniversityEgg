SubProceso buscadorCoordenadas(matriz Por Referencia)
	
	Definir ingreso, i, j Como Entero
	Definir comprueba Como Logico

	Escribir "Ingrese un entero a buscar: "
	
	Leer ingreso
	
	comprueba = Falso
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			Si (matriz[i, j] == ingreso) Entonces
				Escribir "El número se encuentra en en la fila: ", i + 1, " y en la columna: ", j + 1, "."
				comprueba = Verdadero
			FinSi
		FinPara
	FinPara
	
	Si (comprueba == Falso) Entonces
		
		Escribir "El entero no se encontró en la matriz."
		
	FinSi
	
FinFuncion


SubProceso completarMatriz(matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			matriz[i, j] = Aleatorio(1, 99)
		FinPara
	FinPara
	
FinSubProceso

SubProceso imprimirMatriz(matriz Por Referencia)
	
	Definir i, j Como Entero
	
	Escribir "La matriz es:"
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso


Algoritmo buscar_coordenadas
	
	Definir matriz Como Entero
	
	Dimension matriz[5, 5]
	
	completarMatriz(matriz)
	
	imprimirMatriz(matriz)
	
	buscadorCoordenadas(matriz)
	
FinAlgoritmo
