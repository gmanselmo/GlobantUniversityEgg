Algoritmo numero_mayor
	
	//	Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el mayor número ingresado.
	
	Definir cantidadNumeros, numeroIngresado, numeroMayor, i Como Entero
	
	Escribir "Ingrese un número: "
	
	Leer cantidadNumeros
	
	numeroMayor = 0
	
	i = 0
	
	Para i<-0 Hasta (cantidadNumeros - 1) Con Paso 1 Hacer
		
		Escribir "Ingrese un número: "
		
		Leer numeroIngresado
		
		Si (numeroIngresado > numeroMayor) Entonces
			
			numeroMayor = numeroIngresado
			
		FinSi
		
	Fin Para
	
	Escribir "El mayor número ingresado es ", numeroMayor

FinAlgoritmo
