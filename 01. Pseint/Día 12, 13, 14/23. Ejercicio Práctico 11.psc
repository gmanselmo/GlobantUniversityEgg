Funcion resultado <- Pareadora(num)
	
	Definir resultado Como Logico
	Definir calculo, contador Como Entero
	
	contador = 0
	
	Mientras (num > 0) Hacer
		
		calculo = num % 10
		
		Si (calculo % 2 == 0) Entonces
			
			contador = contador + 1
			
		FinSi
		
		num = trunc(num / 10)
		
	FinMientras
	
	Si (contador > 0) Entonces
		
		resultado = Falso
		
	SiNo
		
		resultado = Verdadero
		
	FinSi
	
FinFuncion

Algoritmo todos_pares
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Imprimir "Ingrese un número entero : "
	Leer num
	
	resultado = Pareadora(num)
	
	Si (resultado = Verdadero) Entonces
		
		Escribir "Todos los digitos que componen el número son impares."
		
	SiNo
		
		Escribir "No todos los digitos del número son impares."
		
	FinSi
	
FinAlgoritmo
