Algoritmo biciesto
	
	Definir ingreso Como Entero
	
	Escribir "Ingrese un a�o: "
	
	Leer ingreso
	
	Si (ingreso mod 4 = 0) Y (ingreso mod 100 > 0)
		Escribir "Es biciesto."
	SiNo
		Si (ingreso mod 100 = 0) Y (ingreso mod 400 = 0)
			Escribir "Es biciesto."
		SiNo
			Escribir "No es biciesto."
		FinSi
	FinSi
	
FinAlgoritmo
