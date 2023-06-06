SubProceso  Mostrador (v)
	
	Definir i Como Entero
	
	Escribir Sin Saltar "["
	
	Para i = 0 Hasta 3 Con Paso 1 Hacer
		
		Escribir Sin Saltar v[i], ","
		
	FinPara
	
	Para i = 4 Hasta 4 Con Paso 1 Hacer
		
		Escribir Sin Saltar v[i], "]"
		
	FinPara
	
	Escribir ""
	
FinSubProceso


Algoritmo relleno_vectores
	
	Definir v1, v2, i Como Entero
	
	Dimension v1[5]
	
	Dimension v2[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		v1[i] = Aleatorio(0, 100)
		
		v2[i] = Aleatorio(0, 100)
		
	FinPara
	
	Mostrador(v1)
	
	Mostrador(v2)
	
FinAlgoritmo
