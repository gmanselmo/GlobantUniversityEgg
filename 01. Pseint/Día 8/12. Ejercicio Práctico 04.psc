Algoritmo suma_ingresos
	
	Definir num, suma Como Entero
	Definir ingreso Como Caracter
	
	ingreso = ""
	suma = 0
	
	Hacer
		
		Escribir "Ingrese un número entero positivo a sumar: "
		
		Leer num
		
		suma = suma + num
		
		Escribir "Ingrese N para salñir o S para ingresar otro número: "
		
		Leer ingreso
			
	Mientras Que (Minusculas(ingreso) <> "n")
	
	Escribir "La suma de todos los numeros ingresados es ", suma
		
FinAlgoritmo
