Algoritmo suma_ingresos
	
	Definir num, suma Como Entero
	Definir ingreso Como Caracter
	
	ingreso = ""
	suma = 0
	
	Hacer
		
		Escribir "Ingrese un n�mero entero positivo a sumar: "
		
		Leer num
		
		suma = suma + num
		
		Escribir "Ingrese N para sal�ir o S para ingresar otro n�mero: "
		
		Leer ingreso
			
	Mientras Que (Minusculas(ingreso) <> "n")
	
	Escribir "La suma de todos los numeros ingresados es ", suma
		
FinAlgoritmo
