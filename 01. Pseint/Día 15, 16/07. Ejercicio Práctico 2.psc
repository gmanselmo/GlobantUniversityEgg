SubProceso Mediadora(cantDias Por Valor)
	
	Definir tempMin, tempMax, tempMedia Como Real
	
	Mientras (cantDias > 0) Hacer
		
		Escribir "Ingrese la temperatura m�nima del d�a: "
		
		Leer tempMin
		
		Escribir "Ingrese la temperatura m�xima del d�a: "
		
		Leer tempMax
		
		Escribir "La temperatura m�dia del d�a fue: ", (tempMin + tempMax) / 2
		
		cantDias = cantDias - 1
		
	FinMientras
	
FinSubProceso

Algoritmo temperaturas
	
	Definir cantDias Como Entero
	
	Escribir "Ingrese la cantidad de d�as a analizar: "
	
	Leer cantDias
	
	Mediadora(cantDias)
	
FinAlgoritmo
