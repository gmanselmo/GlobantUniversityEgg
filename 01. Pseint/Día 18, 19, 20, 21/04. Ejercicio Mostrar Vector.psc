Algoritmo definir_vector
	
	Definir arrayStr, mascota Como Caracter
	Definir arrayInt, i Como Entero
	
	Dimension arrayStr[5]
	
	arrayStr[0] = "Perro"
	arrayStr[1] = "Gato"
	arrayStr[2] = "Ratón"
	arrayStr[3] = "Pez"
	arrayStr[4] = "Jirafra"
	
	Dimension arrayInt[5]
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		
		arrayInt[i] = i + 1
		
	FinPara
	
	Escribir arrayStr[3]
	
	mascota = arrayStr[4]
	
	Escribir mascota
	
FinAlgoritmo