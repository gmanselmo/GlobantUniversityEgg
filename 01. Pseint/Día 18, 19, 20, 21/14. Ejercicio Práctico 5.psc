Funcion retorno = Max(vector, n)
	
	Definir i, retorno Como Entero
	
	retorno = 0
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		
		Si (vector[i] > retorno) Entonces
			
			retorno = vector[i]
			
		FinSi
		
	FinPara
	
FinFuncion


Algoritmo rellenador
	
	Definir vector, n, mayor, i, ingreso Como Entero
	
	Escribir "Ingrese un entero: "
	
	Leer n
	
	Dimension vector[n]
	
	Escribir "Ingrese los enteros deseados: "
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		
		Leer ingreso
		
		vector[i] = ingreso
		
	FinPara
	
	mayor = Max(vector, n)
	
	Escribir mayor
	
FinAlgoritmo
	