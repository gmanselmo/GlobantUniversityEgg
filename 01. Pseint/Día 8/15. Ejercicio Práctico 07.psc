Algoritmo juego
	
	Definir numeroAleatorio, numeroIngreso Como Entero
	
	numeroAleatorio = Aleatorio(1, 10)
	
	Hacer
		
		Escribir "Adivina que n�mero estoy pensando: "
		
		Leer numeroIngreso
		
		Si (numeroIngreso > numeroAleatorio) Entonces
			
			Escribir "Estoy pensando en un n�mero m�s bajo."
			
		SiNo
			
			Si (numeroIngreso < numeroAleatorio) Entonces
				
				Escribir "Estoy pensando en un n�mero m�s alto."
				
			SiNo
				
				Escribir "Ganaste."
				
			FinSi
			
		FinSi
		
	Mientras Que (numeroIngreso <> numeroAleatorio)
	
FinAlgoritmo
