SubProceso Codificadora(frase Por Referencia)
	
	Definir letra, cambiada Como Caracter
	Definir i Como Entero
	
	Para i = 0 Hasta (Longitud(frase)) Con Paso 1 Hacer
		
		letra = Subcadena(frase, i, i)
		
		Segun Minusculas(letra) Hacer
			"a":
				cambiada = "@"
			"e":
				cambiada = "#"
			"i":
				cambiada = "$"
			"o":
				cambiada = "%"
			"u":
				cambiada = "*"
			De Otro Modo:
				cambiada = letra
		Fin Segun
		
		Escribir Sin Saltar cambiada
		
	FinPara
	
	Escribir ""
	
FinSubProceso

Algoritmo codificador
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase a codificar: "
	
	Leer frase
	
	Codificadora(frase)
	
FinAlgoritmo
