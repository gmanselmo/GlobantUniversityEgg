Algoritmo media_aritmetica
	
	Definir num, sumaPares, sumaImpares, contadorPares, contadorImpares, contador Como Entero
	Definir media Como Caracter
	
	Escribir "A continuaci�n ingrese en orden 10 n�meros para calcular su media aritm�tica."
	
	contador = 10
	sumaPares = 0
	sumaImpares = 0
	contadorPares = 0
	contadorImpares = 0
	
	Hacer
		
		Escribir "Ingrese un n�mero: "
		
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
	
		Escribir "Media aritm�tica de n�meros pares: ", (sumaPares / contadorPares)
		
		Escribir "Media aritm�tica de n�meros impares: ", (sumaImpares / contadorImpares)
		
	SiNo
		Si (contadorPares > 0) Entonces
			
			Escribir "Media aritm�tica de n�meros pares: ", (sumaPares / contadorPares)
			
		SiNo
			
			Escribir "Media aritm�tica de n�meros impares: ", (sumaImpares / contadorImpares)
			
		FinSi
		
	FinSi
	
FinAlgoritmo
