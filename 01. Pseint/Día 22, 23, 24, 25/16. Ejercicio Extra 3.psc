Algoritmo matriz_binaria
	
	Definir i, j, matriz Como Entero
	
	Dimension matriz[5, 15]
	
	i = 0
	j = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Para j = 0 Hasta 14 Con Paso 1 Hacer
			
			Si (i == 0) O (i == 4) O (j == 0) O (j == 14)Entonces
							
				matriz[i, j] = 1
				
				Escribir Sin Saltar matriz[i, j]
				
			SiNo
				
				matriz[i, j] = 0
				
				Escribir Sin Saltar matriz[i, j]
				
			FinSi
			
		FinPara
		
		Escribir ""
		
	FinPara
	
FinAlgoritmo
