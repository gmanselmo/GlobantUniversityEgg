Algoritmo unidades
	
	Definir centena, decena, unidad, i Como Real
	
	Escribir "Ingrese un n�mero de tres cifras: "
	Leer i
	
	//Explicaci�n con 123:
	
	//Numero dividido 100 le corre dos numeros la coma, y deja la centena.
	centena = trunc(i / 100)
	Escribir "Centena: ", centena
	
	//Sacar el modulo del numero dividiendolo por 100. Da 23.
	//Dividir resultado por 10 que le corre la coma 1 lugar. Da 2.3.
	//Eliminar los decimales con funci�n trunc(). Entrega la decena. Da 2.
	decena = trunc((i mod 100) / 10)
	Escribir "Decena: ", decena
	
	//Sacar el modulo del numero dividiendolo por 10. Da 3.
	unidad = i mod 10
	Escribir "Unidad: ", unidad
		
FinAlgoritmo
