Funcion Capicuadora(num)
	
	Definir i, reverso, ingreso Como Entero
	
	ingreso = num
		
	reverso = 0
	
	Mientras (num > 0) Hacer
		
		i = num % 10
		
		reverso = reverso * 10 + i
		
		num = Trunc(num / 10)
				
	FinMientras
	
	Si (ingreso == reverso) Entonces
		
		Escribir "Es capic�a."
		
	SiNo
		
		Escribir "No es capic�a."
		
	FinSi
	
FinFuncion

Algoritmo capicua
	
	Definir num Como Entero
	
	Escribir "Ingrese un n�mero: "
	
	Leer num
		
	Capicuadora(num)
	
FinAlgoritmo
