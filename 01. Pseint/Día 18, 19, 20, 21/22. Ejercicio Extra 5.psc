SubProceso Numerador()
	
	Definir i Como Entero
	
	Escribir ""
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		Escribir Sin Saltar i, "  | "
		
	FinPara
	
	Escribir ""
	Escribir ""
	
FinSubProceso

Algoritmo insertar_caracter
	
	Definir vector, frase, letra Como Caracter
	
	Definir i, n Como Entero
	
	Dimension vector[20]
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	Escribir ""
	
	Para i = 0 Hasta 19 Con Paso 1 Hacer
		
		vector[i] = Subcadena(frase, i, i)
		
		Escribir Sin Saltar vector[i], "  | "
		
	FinPara
	
	Numerador()
	
	
	// /////////////////////////////////////////
	
	Escribir "Ingrese un caracter y un indice entre 0 y 19.: "
	
	Leer letra, n
	
	Definir izq, der Como Entero
	
	Para i = 0 Hasta i Con Paso 1 Hacer
		
		Si ((vector[n] == "") O (vector[n] == " "))
			
			vector[n] = letra
			
		FinSi
		
	FinPara
	
	izq = 0
	
	Para i = n Hasta 0 Con Paso -1 Hacer
		
		Si ((vector[i] == "") O (vector[i] == " "))
			
			Si (izq < i) Entonces
				
				izq = i
				
			FinSi
			
		FinSi
		
	FinPara
	
	izq = n - izq
	
	
	der = Longitud(frase) - 1
	
	Para i = n Hasta 19 Con Paso 1 Hacer
		
		Si ((vector[i] == "") O (vector[i] == " "))
			
			Si (der > i) Entonces
				
				der = i
				
			FinSi
			
		FinSi
		
	FinPara
	
	der = der - n
	

	//Para la izquierda.
	Si (der > izq) Entonces
		
		Para i = 0 Hasta n Con Paso 1 Hacer
			
			vector[i] = vector[i + 1]
							
		FinPara
		
		vector[n] = letra
		
	FinSi
	
	//Para la derecha.
	Si (izq > der) O (izq == der) Entonces
		
		Para i = 19 Hasta n Con Paso -1 Hacer
			
			vector[i] = vector[i - 1]
						
		FinPara
		
		vector[n] = letra
			
	FinSi
	
	
	//Imprimir nuevo vector.
	Para i = 0 Hasta 19 Hacer
		
		Escribir Sin Saltar vector[i], "  | "
		
	FinPara
	
	Numerador()
	
FinAlgoritmo


