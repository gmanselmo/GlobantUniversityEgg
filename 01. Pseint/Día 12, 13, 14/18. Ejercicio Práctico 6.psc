Funcion resultado <- SumaDivisoresN ( num )
	
	Definir resultado, i Como Entero
	
	resultado = 0
	
	Para i = 1 Hasta num - 1 Con Paso 1 Hacer
		
		Si (num % i == 0) Entonces
			
			resultado = resultado + i	

		FinSi
		
	FinPara
	
Fin Funcion

Algoritmo suma_divisores
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero: "
	
	Leer num
	
	Imprimir SumaDivisoresN(num)
	
FinAlgoritmo