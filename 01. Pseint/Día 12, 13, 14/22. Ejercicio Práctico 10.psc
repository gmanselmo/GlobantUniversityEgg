Funcion suma <- Sumadora(num Por Valor)
	
	Definir suma, digito Como Real
	
	suma = 0
	
	digito = 0
	
	Mientras (num != 0) Hacer
		
		//Ultimo número.
		
		digito = num % 10
		
		suma = suma + digito
		
		//Corre la coma.
		
		num = trunc(num / 10)
		
	FinMientras
	
FinFuncion

Algoritmo suma_digitos
	
	Definir num Como Entero
	
	num = 25
	
	Escribir Sumadora(num)
	
FinAlgoritmo
	