Algoritmo par_impar
	
	Definir ingreso Como Entero
	
	Escribir "Ingrese un entero: "
	
	Leer ingreso
	
	Si (ingreso = 0) Entonces
		Escribir "El n�mero no es par ni impar."
	SiNo 
		Si (ingreso mod 2 = 0) Entonces
			Escribir "El n�mero es par."
		SiNo
			Escribir "El n�mero es impar."
			
		FinSi
	FinSi
	
FinAlgoritmo