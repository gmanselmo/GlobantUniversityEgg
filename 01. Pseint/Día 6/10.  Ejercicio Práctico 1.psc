Algoritmo calculadora
	
	Definir num1, num2 Como Entero
	Definir operador Como Caracter
	
	Escribir "Ingrese dos numeros para operar: "
	
	Leer num1, num2
	
	Escribir "Ingrese S para sumar, R para restar, M para multiplicar o D para dividir los números entre si: "
	
	Leer operador
	
	Segun Mayusculas(operador) Hacer
		"S":
			Escribir num1 + num2
		"R":
			Escribir num1 - num2
		"M":
			Escribir num1 * num2
		"D":
			Escribir num1 / num2
	FinSegun
	
FinAlgoritmo
