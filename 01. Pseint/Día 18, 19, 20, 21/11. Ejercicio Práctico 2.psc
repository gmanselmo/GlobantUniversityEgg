SubProceso Suma(arrayFloat)
	
	Definir calculo, i Como Real
	
	calculo = 0
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		
		calculo = calculo + arrayFloat[i]
		
	FinPara
	
	Escribir "La suma de todos los n�meros es: ", calculo, "."
	
FinSubProceso

SubProceso Resta(arrayFloat)
	
	Definir calculo, i Como Real
	
	calculo = 0
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		
		calculo = calculo - arrayFloat[i]
		
	FinPara
	
	Escribir "La resta de todos los n�meros es: ", calculo, "."
	
FinSubProceso

SubProceso Multiplicacion(arrayFloat)
	
	Definir calculo, i Como Real
	
	calculo = 1
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		
		calculo = calculo * arrayFloat[i]
		
	FinPara
	
	Escribir "La multiplicaci�n de todos los n�meros es: ", calculo, "."
	
FinSubProceso

Algoritmo calculos
	
	Definir arrayFloat, i, ingreso Como Real
	
	Dimension arrayFloat[10]
	
	Escribir "Ingrese 10 n�meros con decimales: "
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		
		Leer ingreso		
		
		arrayFloat[i] = ingreso
		
	FinPara
	
	Suma(arrayFloat)
	
	Resta(arrayFloat)
	
	Multiplicacion(arrayFloat)
	
FinAlgoritmo
