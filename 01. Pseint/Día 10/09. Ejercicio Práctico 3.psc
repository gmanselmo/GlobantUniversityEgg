Algoritmo escalera_invertida

	Definir ingreso, i, vuelta Como Entero
	
	Definir simbolo Como Caracter
		
	Escribir "Ingrese un número entero para definir los escalones: "
	
	Leer ingreso
	
	simbolo = "*"
	
	Para i = ingreso Hasta 1 Con Paso -1 Hacer
		
		Para vuelta = 1 Hasta i Con Paso 1 Hacer
			
			Escribir Sin Saltar simbolo
			
		FinPara
		
		Escribir ""

	FinPara
	
FinAlgoritmo
