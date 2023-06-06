Algoritmo palabra_matriz
	
	Definir ingreso, matriz Como Caracter
	Definir i, j, contador Como Entero
	
	Dimension matriz[3, 3]
	
	ingreso = ""	
	contador = 0
	
	Mientras (Longitud(ingreso) <> 9) Hacer
		
		Limpiar Pantalla
		
		Escribir "Ingrese una palabra de 9 letras: "
		
		Leer ingreso
		
	FinMientras
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
				matriz[i, j] = Subcadena(ingreso, contador, contador)
				Escribir Sin Saltar matriz[i, j]
				contador = contador + 1			
			FinPara
			Escribir ""
	FinPara
	
FinAlgoritmo
