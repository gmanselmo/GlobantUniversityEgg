Algoritmo intervalos
	
	Definir min, max, ingresado, contador Como Entero
	
	Escribir "Ingrese un n�mero minimo y uno m�ximo: "
	
	Leer min, max
	
	Escribir "Ingrese un n�mero entero dentro del intervalo indicado: "
	
	Leer ingresado
	
	contador = 0
	
	Mientras (ingresado > min) Y (ingresado < max)  Hacer
		
		Escribir "Ingrese un n�mero entero dentro del intervalo indicado: "
		
		Leer ingresado
		
		contador =  contador + 1
		
	FinMientras
	
	Escribir "La cantidad de n�meros v�lidos ingresados dentro del intervalo es ", contador
	
FinAlgoritmo
