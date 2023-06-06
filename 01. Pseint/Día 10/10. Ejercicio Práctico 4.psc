Algoritmo factoriales
	
	//	Definir las variables.
	Definir i, j, factorial Como Entero
	
	//	Mostrar ejercicio en pantalla.
    Escribir("Cálculo de factoriales")
	
	//	Para cada número en el rángo del 1 al 5.
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		//	Definir la variable factorial en 1 que es el primer número
		factorial = 1
		
		//	Imprime en pantalla sin cambiar de linea el número i con el formato indicado !1=.
		Escribir Sin Saltar "!" + ConvertirATexto(i) + "="
		
		//	Para cada número en el rango del 1 al 5.
		Para j = 1 Hasta i Con Paso 1 Hacer
			
			//	factorial es igual a factorial por el número actual en j.
			factorial = factorial * j
			
			//	Si el número actual en j es igual al número actual en i.
			Si (j = i)
				
				//	Añade al final de la linea inicial el número actual de j.
				Escribir Sin Saltar j
				
				//	Si el número actual de j no es igual al número actual de i.
			SiNo
				
				//	Añadir a la linea el número contenido actualmente en j + el simbolo *.
				Escribir Sin Saltar ConvertirATexto(j) + "*"
				
				//	Termina el sí.
			FinSi
			
			//	Termina el bucle para de los números contenidos en j.
		FinPara
		
		//	Añade el = y el calculo final del factorial a la linea.
		Escribir Sin Saltar "=" + ConvertirATexto(factorial)
		
		//	Hace un salto de linea.
		Escribir ""
		
		//	Repite todo por cada número contenido en i.
		
		//	Al dar la vuelta por todos los números contenidos en i, termina el bucle.
	FinPara
	
Fin Algoritmo
