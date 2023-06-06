Algoritmo digitos
	
	Definir ingreso, contador Como Entero
	
	Escribir "Ingrese un número positivo: "
	
	Leer ingreso
	
	contador = 0
	
	Mientras (ingreso > 0) Hacer
		
		ingreso = trunc(ingreso / 10)
		
		contador = contador + 1
		
	FinMientras
	
	Escribir "El número tiene ", contador, " digitos."
	
FinAlgoritmo
