SubProceso Eliminador(frase)
	
	Definir i, v1, v2, v3, v4, v5 Como Entero
	Definir letra, cambiada Como Caracter
	
	v1 = 0
	v2 = 0
	v3 = 0
	v4 = 0
	v5 = 0
	cambiada = ""
	
	Para i = 0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		letra = Subcadena(frase, i, i)
		
		Si (v1 = 0) Y (Minusculas(letra) == "a") Entonces
			cambiada = Concatenar(cambiada, letra)
			v1= v1 + 1
		SiNo
			Si (v2 = 0) Y (Minusculas(letra) == "e") Entonces
				cambiada = Concatenar(cambiada, letra)
				v2= v2 + 1
			SiNo
				Si (v3 = 0) Y (Minusculas(letra) == "i") Entonces
					cambiada = Concatenar(cambiada, letra)
					v3= v3 + 1
				SiNo
					Si (v4 = 0) Y (Minusculas(letra) == "o") Entonces
						cambiada = Concatenar(cambiada, letra)
						v4= v4 + 1
					SiNo
						Si (v5 = 0) Y (Minusculas(letra) == "u") Entonces
							cambiada = Concatenar(cambiada, letra)
							v5= v5 + 1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si (letra == "a") O (letra == "e") O (letra == "i") O (letra == "o") O (letra == "u") 
			cambiada = Concatenar(cambiada, "")
		SiNo
			cambiada = Concatenar(cambiada, letra)
		FinSi
		
	FinPara
	
	Escribir cambiada
	
FinSubProceso

Algoritmo eliminar_repetidas
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase: "
	
	Leer frase
	
	Eliminador(frase)
	
FinAlgoritmo
