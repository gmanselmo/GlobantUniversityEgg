Algoritmo manzanas
	
	Definir ingreso Como Entero
	
	Escribir "Ingrese la cantidad de Kg. comprados: "
	
	Leer ingreso
	
	Si (ingreso > 0) Y (ingreso <= 2)
		Escribir "Pagará el total del precio."
	SiNo
		Si (ingreso > 2) Y (ingreso <= 5)
			Escribir "Pagará el 90% del valor total del precio."
		SiNo
			Si (ingreso > 5) Y (ingreso <= 10)
				Escribir "Pagará el 85% del valor total del precio."
			SiNo
				Escribir "Pagará el 80% del valor total del precio."
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
