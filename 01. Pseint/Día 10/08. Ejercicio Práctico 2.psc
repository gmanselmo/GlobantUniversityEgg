Proceso cuadrado_asteriscos
	
    Definir ingreso, i, j Como Entero
    
    Escribir "Ingrese en enteros el lado del cuadrado:"
	
    Leer ingreso
    
    Para i = 1 hasta ingreso Con Paso 1 Hacer
		
        Para j = 1 hasta ingreso Con Paso 1 Hacer
			
            Si (i = 1) O (i = ingreso) O (j = 1) O (j = ingreso) Entonces
                
				Escribir Sin Saltar "*  "
				
			Sino
				
				Escribir Sin Saltar "   "
				
			FinSi
			
		FinPara
        
		Escribir("")
		
	FinPara
	
FinProceso
