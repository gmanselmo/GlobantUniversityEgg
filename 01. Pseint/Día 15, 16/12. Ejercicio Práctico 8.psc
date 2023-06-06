SubProceso diaAnterior(dd, mm, yyyy)
	
	Si (mm == 1) Y (dd == 1) entonces
		
        Escribir "31-12-", yyyy - 1
		
    SiNo 
		
		Si (dd == 1) Entonces
			
			Si (mm == 5) O (mm == 7) O (mm == 10) O (mm == 12) Entonces
				
				Escribir "30-" mm - 1, "-", yyyy
				
			SiNo 
				
				Si (mm == 3) Entonces
					
					Escribir "28-", mm - 1, "-", yyyy
										
				SiNo
					
					Escribir "31-", mm - 1, "-", yyyy
					
				FinSi
				
			FinSi
			
		SiNo
			
			Escribir dd - 1, "-", mm, "-", yyyy
			
		FinSi
		
	FinSi
	
FinSubProceso

Algoritmo fecha_anterior
	
	Definir dd, mm, yyyy Como Entero
	
	Escribir "Ingrese el día, el mes y el año en orden: "
	
	Leer dd, mm, yyyy
	
	diaAnterior(dd, mm, yyyy)
		
FinAlgoritmo
