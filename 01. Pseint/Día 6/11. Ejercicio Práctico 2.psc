Algoritmo par_impar
	
	Definir ingreso Como Entero
	
	Escribir "Ingrese un entero: "
	
	Leer ingreso
	
	Si (ingreso = 0) Entonces
		Escribir "El número no es par ni impar."
	SiNo 
		Si (ingreso mod 2 = 0) Entonces
			Escribir "El número es par."
		SiNo
			Escribir "El número es impar."
			
		FinSi
	FinSi
	
FinAlgoritmo