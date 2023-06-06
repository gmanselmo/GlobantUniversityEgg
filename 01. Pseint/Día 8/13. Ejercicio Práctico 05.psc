Algoritmo media_aritmetica
	
	Definir num, sumaPares, sumaImpares, contadorPares, contadorImpares, contador Como Entero
	Definir media Como Caracter
	
	Escribir "A continuación ingrese en orden 10 números para calcular su media aritmética."
	
	contador = 10
	sumaPares = 0
	sumaImpares = 0
	contadorPares = 0
	contadorImpares = 0
	
	Hacer
		
		Escribir "Ingrese un número: "
		
		Leer num
		
		Si (num mod 2 = 0) Entonces
			
			sumaPares = sumaPares + num
			
			contador = contador - 1
			
			contadorPares = contadorPares + 1
			
		SiNo
			sumaImpares = sumaImpares + num
			
			contador = contador - 1
			
			contadorImpares = contadorImpares + 1
			
		FinSi
		
	Mientras Que (contador <> 0)
	
	Si (contadorPares > 0) Y (contadorImpares > 0) Entonces
	
		Escribir "Media aritmética de números pares: ", (sumaPares / contadorPares)
		
		Escribir "Media aritmética de números impares: ", (sumaImpares / contadorImpares)
		
	SiNo
		Si (contadorPares > 0) Entonces
			
			Escribir "Media aritmética de números pares: ", (sumaPares / contadorPares)
			
		SiNo
			
			Escribir "Media aritmética de números impares: ", (sumaImpares / contadorImpares)
			
		FinSi
		
	FinSi
	
FinAlgoritmo
