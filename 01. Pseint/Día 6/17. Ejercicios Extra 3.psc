Algoritmo largo_numero
	
	Definir ingreso, digitos Como Entero
	
	Escribir "Ingrese un número de 3 digitos: "
	
	Leer ingreso
	
	Si (ingreso < 1000) Y (ingreso > 99)
		digitos = 3
	SiNo
		digitos = 1
	FinSi

	Segun digitos Hacer
		3:
			Escribir "Es de 3 dígitos."
		De Otro Modo:
			Escribir "No es de 3 dígitos."
	FinSegun
	
FinAlgoritmo

