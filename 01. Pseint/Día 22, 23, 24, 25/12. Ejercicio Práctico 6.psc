Funcion ingreso = comprobarIngresos()
		
		Definir ingreso, n Como Entero
		
		n = 0
		
		Mientras ((n > 9) O (n < 1)) Hacer
			Escribir "Ingrese un entero entre 0 y 9: "
			Leer n
			Limpiar Pantalla
		FinMientras
		
		ingreso = n
		
FinFuncion


SubProceso completarMatriz (ingreso, matriz Por Referencia)
	
	Definir n, i, j Como Entero
	
	Escribir "Defina cada elemento de la matriz."
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		Para j = 0 Hasta ingreso - 1  Con Paso 1 Hacer
			Escribir "[", i, ",", j, "]"
			n = comprobarIngresos()
			matriz[i, j] = n
		FinPara
	FinPara
	
	Limpiar Pantalla
	
FinSubProceso


SubProceso magicidadEnMatriz(ingreso, matriz Por Referencia, filas, columnas, diagonales)
	
	Definir i, j, k, n, sumaFila, sumaColumna, sumaDiagonal1, sumaDiagonal2, contador, contador2 Como Real
		
	sumaFila = 0
	sumaColumna = 0
	sumaDiagonal1 = 0
	sumaDiagonal2 = 0
	n = ingreso
	
	//Suma filas.
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		sumaFila = 0
		
		Para j = 0 Hasta ingreso - 1 Con Paso 1 Hacer
			
			sumaFila = sumaFila + matriz[i, j]
							
			filas[i] = sumaFila
					
		FinPara
		
	FinPara
	
	//Suma columna.
	
	Para j= 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		sumaColumna = 0
		
		Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
			
			sumaColumna = sumaColumna + matriz[i, j]

			columnas[j] = sumaColumna
			
		FinPara
		
	FinPara
	
	//Suma diagonales.
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer

		sumaDiagonal1 = sumaDiagonal1 + matriz[i, i]
		
	FinPara
	
	Para i = 0 Hasta 0 Con Paso 1 Hacer
		
		diagonales[i] = sumaDiagonal1
				
	FinPara
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer	
		
		sumaDiagonal2 = sumaDiagonal2 + matriz[i, ingreso - 1]
		
		ingreso = ingreso - 1 
		
	FinPara
	
	Para i = 1 Hasta 1 Con Paso 1 Hacer
		
		diagonales[i] = sumaDiagonal2
				
	FinPara
	
	contador = 0
	contador2 = 0
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		
		Si (filas[i] <> columnas[i]) Entonces
			contador = contador + 1
		FinSi
		
	FinPara
	
	Si (diagonales[0] <> diagonales[1]) Entonces
		contador2 = contador2 + 1
	FinSi

	Si (contador = 0) Y (contador2 = 0) Entonces
		Escribir "Es una matriz mágica. La suma de cada lado, como por diagonales da ",  sumaFila, "."
		
	SiNo
		Escribir "No es una matriz mágica."
	FinSi
	
FinSubProceso


Algoritmo matriz_magica
	
	Definir matriz, filas, columnas, diagonales, ingreso Como Entero
	
	Escribir "Defina los lados de la matriz."
	
	ingreso = comprobarIngresos()
	
	Dimension matriz[ingreso, ingreso], filas[ingreso], columnas[ingreso], diagonales[2]
	
	completarMatriz(ingreso, matriz)
	
	magicidadEnMatriz(ingreso, matriz, filas, columnas, diagonales)
	
FinAlgoritmo