Algoritmo intervalos
	
	Definir min, max, ingresado, contador Como Entero
	
	Escribir "Ingrese un número minimo y uno máximo: "
	
	Leer min, max
	
	Escribir "Ingrese un número entero dentro del intervalo indicado: "
	
	Leer ingresado
	
	contador = 0
	
	Mientras (ingresado > min) Y (ingresado < max)  Hacer
		
		Escribir "Ingrese un número entero dentro del intervalo indicado: "
		
		Leer ingresado
		
		contador =  contador + 1
		
	FinMientras
	
	Escribir "La cantidad de números válidos ingresados dentro del intervalo es ", contador
	
FinAlgoritmo
