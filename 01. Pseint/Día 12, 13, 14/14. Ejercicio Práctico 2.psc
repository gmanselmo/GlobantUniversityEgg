Funcion bool <- esPar ( num Por Valor )

	Definir bool Como Logico
	
	Si (num mod 2 == 0) Entonces
		bool = Verdadero
	SiNo
		bool = Falso
	FinSi
	
Fin Funcion


Algoritmo comprobador_pares
	
	Definir num Como Entero
	Definir comprobacion Como Logico
	
	num = 2
	
	comprobacion = esPar(num)
	
	Si comprobacion = Verdadero Entonces
		Escribir "El n�mero es par."
	SiNo
		Escribir "El n�mero es impar."
	FinSi
	
FinAlgoritmo
