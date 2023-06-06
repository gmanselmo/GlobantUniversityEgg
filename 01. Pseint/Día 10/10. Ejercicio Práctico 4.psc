Algoritmo factoriales
	
	//	Definir las variables.
	Definir i, j, factorial Como Entero
	
	//	Mostrar ejercicio en pantalla.
    Escribir("C�lculo de factoriales")
	
	//	Para cada n�mero en el r�ngo del 1 al 5.
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		//	Definir la variable factorial en 1 que es el primer n�mero
		factorial = 1
		
		//	Imprime en pantalla sin cambiar de linea el n�mero i con el formato indicado !1=.
		Escribir Sin Saltar "!" + ConvertirATexto(i) + "="
		
		//	Para cada n�mero en el rango del 1 al 5.
		Para j = 1 Hasta i Con Paso 1 Hacer
			
			//	factorial es igual a factorial por el n�mero actual en j.
			factorial = factorial * j
			
			//	Si el n�mero actual en j es igual al n�mero actual en i.
			Si (j = i)
				
				//	A�ade al final de la linea inicial el n�mero actual de j.
				Escribir Sin Saltar j
				
				//	Si el n�mero actual de j no es igual al n�mero actual de i.
			SiNo
				
				//	A�adir a la linea el n�mero contenido actualmente en j + el simbolo *.
				Escribir Sin Saltar ConvertirATexto(j) + "*"
				
				//	Termina el s�.
			FinSi
			
			//	Termina el bucle para de los n�meros contenidos en j.
		FinPara
		
		//	A�ade el = y el calculo final del factorial a la linea.
		Escribir Sin Saltar "=" + ConvertirATexto(factorial)
		
		//	Hace un salto de linea.
		Escribir ""
		
		//	Repite todo por cada n�mero contenido en i.
		
		//	Al dar la vuelta por todos los n�meros contenidos en i, termina el bucle.
	FinPara
	
Fin Algoritmo
