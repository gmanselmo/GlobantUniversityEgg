Funcion resta <- DiferenciaMaxMin(vector)
	
	Definir i, min, max, resta Como Entero
	
	min = 101
	
	max = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Si (vector[i] < min) Entonces
			
			min = vector[i]
			
		FinSi
		
		Si (vector[i] > max) Entonces
			
			max = vector[i]
			
		FinSi
		
	FinPara
	
	resta = max-min
	
Fin Funcion


Algoritmo diferencia
	
	Definir vector, i, resta Como Entero
	
	Dimension vector[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		vector[i] = Aleatorio(1, 100)
				
	FinPara
	
	resta = DiferenciaMaxMin(vector)
	
	Escribir resta
	
FinAlgoritmo
