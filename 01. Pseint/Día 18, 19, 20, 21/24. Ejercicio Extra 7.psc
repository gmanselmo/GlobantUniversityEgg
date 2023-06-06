Funcion producto <- Productora(arreglo)
	
	Definir i, producto Como Entero
	
	producto = 1

	Para i = 0 Hasta 3 Con Paso 1 Hacer
		
		producto = producto * arreglo[i]
		
	FinPara
	
FinFuncion


Algoritmo producto_arreglo
	
	Definir i, arreglo, producto Como Entero
	
	Dimension arreglo[4]
	
	Para i = 0 Hasta 3 Con Paso 1 Hacer
		
		arreglo[i] = Aleatorio(1, 25)
		
		Escribir arreglo[i]
		
	FinPara
	
	producto = Productora(arreglo)	
	
	Escribir producto
	
FinAlgoritmo
