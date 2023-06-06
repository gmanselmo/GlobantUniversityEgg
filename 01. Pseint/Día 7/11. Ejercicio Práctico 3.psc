Algoritmo secuencia
	
	Definir ingreso, almacen, corte Como Entero
	
	Escribir "Ingrese una secuencia de números y para termiar ingrese un -1"
	
	Leer ingreso
	
	almacen = ingreso +1
	
	corte = 0
	
	Mientras (ingreso >= 0)
				
		Escribir "Ingrese otro número o -1 para terminar: "
		
		Leer ingreso
		
		almacen = almacen + ingreso
		
		corte = corte + 1
		
	FinMientras
	
	Escribir "El promedio es: " ((almacen)/corte)
	
	
FinAlgoritmo
