Funcion Fibonacciadora(num)
	
	Definir i, j, k, l Como Entero
	
	j = 1
	
	k = 1
	
	Escribir Sin Saltar "1, 1, "
	
	Si (num > 1) Entonces
		
		Para i = 1 Hasta num - 3 Con Paso 1 Hacer
			
			l = j + k
			
			j = k
			
			k = l
			
			Escribir Sin Saltar k, ", "
			
		FinPara
		
		Escribir Sin Saltar k + j , "."
		
	FinSi
	
FinFuncion

Algoritmo fibonacci
	
	Definir num Como Entero
	
	Escribir "Ingrese un número entero: "
	
	Leer num
	
	Fibonacciadora(num)	
	
FinAlgoritmo
