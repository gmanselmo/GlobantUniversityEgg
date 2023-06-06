Algoritmo primera_letra
	
	Definir ingreso, primerLetra, ultimaLetra Como Caracter
	Definir longitudIngreso Como Entero
	
	Escribir "Ingrese una frase o palabra: "
	
	Leer ingreso
	
	longitudIngreso = Longitud(ingreso)
	
	primerLetra = Mayusculas(Subcadena(ingreso, 0, 0))
	
	ultimaLetra = Mayusculas(Subcadena(ingreso, longitudIngreso - 1, longitudIngreso))	
	
	Si (primerLetra = ultimaLetra) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
