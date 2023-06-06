Algoritmo frase_espaciada
	
	Definir frase, contada, nueva Como Caracter
	Definir contador, vueltas, i Como Entero
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	contador = Longitud(frase) - 1
	
	vueltas = 0
	
	contada = " "
	
	Para i = 0 Hasta (contador) Con Paso 1 Hacer
		
		nueva = Subcadena(frase, vueltas, vueltas)
		
		contada = contada + " " + nueva
		
		vueltas = vueltas + 1

	FinPara
	
	Escribir contada
	
	
FinAlgoritmo
