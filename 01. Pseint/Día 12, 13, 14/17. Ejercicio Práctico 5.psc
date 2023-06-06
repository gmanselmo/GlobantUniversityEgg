Funcion resultado <- esPrimo ( num Por Valor )
	
	Definir i, contador Como Entero
	Definir resultado Como Logico
	
	contador = 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		
		Si (num mod i == 0) Entonces
			
			contador = contador + 1
			
		FinSi
		
	FinPara
	
	Si (contador > 2) Entonces
		resultado = Falso
	SiNo
		resultado = Verdadero
		
	FinSi

Fin Funcion

Algoritmo calculando_primos
	
	Definir num Como Entero
	
	Escribir "Ingrese un número: "
	Leer num
	
	Si (esPrimo(num) = Verdadero) Entonces
		Escribir "El número es Primo."
	SiNo
		
		Escribir "El número no es Primo."
	FinSi
	
FinAlgoritmo
