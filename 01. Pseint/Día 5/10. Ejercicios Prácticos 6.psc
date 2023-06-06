Algoritmo primera_letra
	
	Definir ingreso Como Caracter
	
	Escribir "Ingrese una frase o palabra: "
	
	Leer ingreso
	
	ingreso = Mayusculas(Subcadena(ingreso, 0, 0))
	
	Si (ingreso = "A") Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
