Funcion calculo <- esMultiplo ( num1 Por Valor, num2 Por Valor )
	
	Definir calculo Como Logico
	
	Si (num1 mod num2 == 0) Entonces
		
		calculo = Verdadero
	SiNo
		calculo = Falso
		
	FinSi

Fin Funcion

Algoritmo multiplo
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos números: "
	
	Leer num1, num2
	
	Escribir esMultiplo(num1, num2)
	
FinAlgoritmo
