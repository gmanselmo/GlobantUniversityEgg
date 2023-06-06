Algoritmo relleno_arreglos
	
	Definir comprobacion Como Logico
	
	Definir arreglo1, arreglo2, i Como Entero
	
	Dimension arreglo1[5]
	
	Dimension arreglo2[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		arreglo1[i] = Aleatorio(1, 100)
		
		arreglo2[i] = Aleatorio(1, 100)

	FinPara
		
	Comprobador(arreglo1, arreglo2, comprobacion)
	
	Si (comprobacion == Falso) Entonces
		
		Escribir "Los números de los arreglos no son iguales."
		
	SiNo
		
		Escribir "Los números de los arreglos son iguales."
		
	FinSi
	
FinAlgoritmo


SubProceso Comprobador (arreglo1, arreglo2, comprobacion Por Referencia)
	
	Definir i Como Entero
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Si (arreglo1[i] <> arreglo2[i]) Entonces
			
			comprobacion = Falso
			
		SiNo
			
			comprobacion = Verdadero
			
		FinSi
				
	FinPara
	
FinSubProceso
	