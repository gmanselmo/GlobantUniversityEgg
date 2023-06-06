SubProceso Sucesivadora(num1 Por Valor, num2 Por Valor)
	
	Mientras (num1 > num2) Hacer
		
		Escribir Sin Saltar num1, " - ", num2, " = "
		
		num1 = num1 - num2
		
		Escribir Sin Saltar num1
		
		Escribir ""
		
	FinMientras
	
	Escribir num1, " ya no puede dividirse por ", num2, " ya que es menor a este."
	
FinSubProceso


Algoritmo resta_sucesiva
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos números enteros a dividir mediante resta sucesiva: "
	
	Leer num1, num2
	
	Sucesivadora(num1, num2)
	
FinAlgoritmo
