Algoritmo digitos
	
	Definir ingreso, contador Como Entero
	
	Escribir "Ingrese un n�mero positivo: "
	
	Leer ingreso
	
	contador = 0
	
	Mientras (ingreso > 0) Hacer
		
		ingreso = trunc(ingreso / 10)
		
		contador = contador + 1
		
	FinMientras
	
	Escribir "El n�mero tiene ", contador, " digitos."
	
FinAlgoritmo
