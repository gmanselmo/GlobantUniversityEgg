SubProceso Escalerita(num)
	
	Definir i, j Como Entero
	
	j = 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
				
		j = j * 10 + i
		
		Escribir j
		
	FinPara
		
FinSubProceso

Algoritmo escalera_numerica
	
	Definir num Como Entero
	
	Escribir "Ingrese un número entero: "
	
	Leer num
	
	Escalerita(num)
	
FinAlgoritmo
