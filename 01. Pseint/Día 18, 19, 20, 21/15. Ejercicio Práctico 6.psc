Algoritmo frase_unidimensional
	
	Definir vector, frase, letra Como Caracter
	
	Definir i, n Como Entero
	
	Dimension vector[20]
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	Escribir ""
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		vector[i] = Subcadena(frase, i, i)
		
		Escribir Sin Saltar vector[i], "  - "
				
	FinPara
	
	Escribir ""
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		vector[i] = Subcadena(frase, i, i)
		
		Escribir Sin Saltar i, "  - "
		
	FinPara
	
	Escribir ""
	Escribir ""
	
	Escribir "Ingrese un caracter y un indice entre 0 y 19.: "
	
	Leer letra, n
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		Si ((vector[n] == "") O (vector[n] == " "))
			
			vector[n] = letra
			
		FinSi
		
	FinPara
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		Escribir Sin Saltar vector[i], "  - "
		
	FinPara
	
	Escribir ""
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		Escribir Sin Saltar i, "  - "
		
	FinPara
	
FinAlgoritmo
