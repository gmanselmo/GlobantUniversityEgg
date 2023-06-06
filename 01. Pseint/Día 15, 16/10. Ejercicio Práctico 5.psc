SubProceso convertirEspaciado(frase)
	
	Definir i Como Entero
	Definir letra Como Caracter
	
	Para i = 0 Hasta (Longitud(frase)) Con Paso 1 Hacer
		letra = Subcadena(frase, i, i)
		
		Si (letra = " ") Entonces
			
			Escribir Sin Saltar letra
			
		SiNo
			
			Escribir Sin Saltar letra, " "

		FinSi

	FinPara

FinSubProceso

Algoritmo espaciador_letras
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	convertirEspaciado(frase)
	
FinAlgoritmo
