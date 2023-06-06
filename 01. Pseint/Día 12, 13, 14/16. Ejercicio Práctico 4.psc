Funcion resultado <- cuentaLetras ( frase, letra )
	
	Definir resultado, contador, i Como Entero
	
	contador = 0
	
	Para i = 0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		Si Subcadena(frase, i, i) = letra Entonces
			
			contador = contador + 1
			
		FinSi
		
	FinPara
	
	resultado = contador
	
Fin Funcion

Algoritmo contar_letra
	
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese una frase y luego una letra a buscar: "
	
	Leer frase, letra
	
	Escribir cuentaLetras(frase, letra)
	
FinAlgoritmo
