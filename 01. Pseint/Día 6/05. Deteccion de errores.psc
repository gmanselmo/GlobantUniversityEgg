Algoritmo correccion_si_anidado
	
	Definir n1, n2, n3 Como Entero
	Escribir "MOSTRAR EL MAYOR DE 3 N�MEROS"
	
	Escribir "INGRESE N�MERO 01 : "
	Leer n1
	
	Escribir "INGRESE N�MERO 02 : "
	Leer n2
	
	Escribir "INGRESE N�MERO 03 : "
	Leer n3
	
	Si (n1 > n2) Y (n1 > n3) Entonces
		Escribir "El mayor es ", n1
	SiNo
		Si (n2 > n1) Y (n2 > n3) Entonces
			Escribir "El mayor es ", n2
		SiNo
			Si (n3 > n1) Y (n3 > n2) Entonces
				Escribir "El mayor es ", n3
			FinSi
		FinSi
	FinSi
FinAlgoritmo
