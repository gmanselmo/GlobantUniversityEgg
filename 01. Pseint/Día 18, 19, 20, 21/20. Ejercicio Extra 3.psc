SubProceso armadoraVectores(nombres, long, ingreso)
	
	Definir persona Como Caracter
	
	Definir i Como Entero
	
	Escribir "Ingrese el nombre de la persona: "
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hasta 
		
		Leer persona
		
		nombres[i] = persona
		
		long[i] = Longitud(persona)
		
	FinPara

FinSubProceso


SubProceso Impresora(nombres, long, ingreso)
	
	Definir i Como Entero
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		Escribir nombres[i], " - Longitud: ", long[i], "."
				
	FinPara
	
FinSubProceso


Algoritmo nombres_longitudinales
	
	Definir nombres Como Caracter
	
	Definir long, i, ingreso Como Entero
	
	Escribir "Ingrese el largo del vector: "
	
	Leer ingreso
	
	Dimension nombres[ingreso]
	
	Dimension long[ingreso]
	
	armadoraVectores(nombres, long, ingreso)
	
	Impresora(nombres, long, ingreso)
	
FinAlgoritmo
