Algoritmo sin_titulo
	
	Definir ingreso, largo Como Real
	
	Escribir "Ingrese un n�mero entero del 1 al infinito: "
	
	Leer ingreso
	
	largo = 0
	
	Mientras (ingreso > 0) Hacer
		
		ingreso = trunc(ingreso / 10)
		
		largo = largo + 1
		
	FinMientras
	
	Escribir "El n�mero tiene un largo de ", largo, " digitos."

FinAlgoritmo
