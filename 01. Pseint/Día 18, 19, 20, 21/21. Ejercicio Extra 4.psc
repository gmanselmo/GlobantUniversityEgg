Algoritmo estudiantes_notas
	
	Definir vector, i, deficientes, regulares, buenos, excelentes Como Entero
	
	Dimension vector[100]
	
	deficientes = 0
	
	regulares = 0
	
	buenos = 0
	
	excelentes = 0
	
	Para i= 0 Hasta 99 Con Paso 1 Hacer
		
		vector[i] = Aleatorio(0, 20)
		
	FinPara
	
	Para i = 0 Hasta 99 Con Paso 1 Hacer
		
		Si (vector[i] <= 5) Entonces
			
			deficientes = deficientes + 1
			
		SiNo
			
			Si (vector[i] > 5) Y (vector[i] <= 10) Entonces
				
				regulares = regulares + 1
				
			SiNo
				
				Si (vector[i] > 10) Y (vector[i] <= 15) Entonces
					
					buenos = buenos + 1
					
				SiNo
					
					Si (vector[i] > 15) Y (vector[i] <= 20) Entonces
						
						excelentes = excelentes + 1
						
					FinSi
				
				FinSi
				
			FinSi
			
		FinSi
		
	FinPara
	
	Escribir "Deficientes 0-5: ", deficientes, "."
	
	Escribir "Regulares 6-10: ", regulares, "."
	
	Escribir "Buenos 11-15: ", buenos, "."
	
	Escribir "Excelentes 16-20: ", excelentes, "."
	
FinAlgoritmo
