SubProceso Cambiador (a Por Referencia, b Por Referencia)
	
	Definir aux Como Entero
	
	aux = a
	
	a = b
	
	b = aux
	
FinSubProceso

Algoritmo cambiador_letras
	
	Definir a, b Como Entero
	
	a = 1
	
	b = 2
	
	Escribir a
	
	Escribir b
	
	Cambiador(a, b)
	
	Escribir a
	
	Escribir b
	
FinAlgoritmo
