Algoritmo suma_matriz
	
	Definir i, j, n1, n2, matriz Como Entero
	
	Escribir "Ingrese la cantidad de filas de la matriz: "
	
	Leer n1
	
	Dimension matriz[n1, 3]
	
	Para i = 0 Hasta n1 - 1 Con Paso 1 Hacer
		
		Limpiar Pantalla
		
		Escribir "Ingrese dos números enteros: "
		
		Leer matriz[i, 0], matriz[i, 1]
		
		matriz[i, 2] = matriz[i, 0] + matriz[i, 1]
		
	FinPara
	
	Limpiar Pantalla
	
	Para i = 0 Hasta n1 - 1 Con Paso 1 Hacer
		
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			
			Segun j Hacer
				
				0:
					
					Escribir Sin Saltar matriz[i, j], " + "
					
				1:
					
					Escribir Sin Saltar matriz[i, j], " = "
					
				De Otro Modo:
					
					Escribir Sin Saltar matriz[i, j], "."
			Fin Segun
			
		FinPara
		
		Escribir ""
		
	FinPara
	
FinAlgoritmo
