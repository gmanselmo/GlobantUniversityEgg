SubProceso Mediadora(cantDias Por Valor)
	
	Definir tempMin, tempMax, tempMedia Como Real
	
	Mientras (cantDias > 0) Hacer
		
		Escribir "Ingrese la temperatura mínima del día: "
		
		Leer tempMin
		
		Escribir "Ingrese la temperatura máxima del día: "
		
		Leer tempMax
		
		Escribir "La temperatura média del día fue: ", (tempMin + tempMax) / 2
		
		cantDias = cantDias - 1
		
	FinMientras
	
FinSubProceso

Algoritmo temperaturas
	
	Definir cantDias Como Entero
	
	Escribir "Ingrese la cantidad de días a analizar: "
	
	Leer cantDias
	
	Mediadora(cantDias)
	
FinAlgoritmo
