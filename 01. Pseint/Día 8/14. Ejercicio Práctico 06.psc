Algoritmo suma_pares
	
	Definir ingreso, suma, par Como Entero
	
	Escribir "Ingrese un número: "
	
	Leer ingreso
	
	suma = 0
	
	par = 0
	
	Hacer
		
		par = par + 2
		
		suma = suma + par
		
		ingreso = ingreso - 1
		
	Mientras Que (ingreso > 0)
	
	Escribir "La suma de los pares comprendidos dentr de su ingreso es ", suma
	
FinAlgoritmo
