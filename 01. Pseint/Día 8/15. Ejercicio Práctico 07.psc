Algoritmo juego
	
	Definir numeroAleatorio, numeroIngreso Como Entero
	
	numeroAleatorio = Aleatorio(1, 10)
	
	Hacer
		
		Escribir "Adivina que número estoy pensando: "
		
		Leer numeroIngreso
		
		Si (numeroIngreso > numeroAleatorio) Entonces
			
			Escribir "Estoy pensando en un número más bajo."
			
		SiNo
			
			Si (numeroIngreso < numeroAleatorio) Entonces
				
				Escribir "Estoy pensando en un número más alto."
				
			SiNo
				
				Escribir "Ganaste."
				
			FinSi
			
		FinSi
		
	Mientras Que (numeroIngreso <> numeroAleatorio)
	
FinAlgoritmo
