SubProceso espera()
	
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	Esperar 1 Segundos
	Escribir Sin Saltar "."
	
	Esperar 3 Segundos
	
	Escribir ""
	
FinSubProceso


SubProceso largoMuestra = comprobadorMuestra(muestra Por Referencia)
	
	Definir bool Como Logico
	
	Definir largoMuestra, i Como Entero
	
	bool = Verdadero
	
	Mientras (bool == Verdadero) Hacer
		
		Limpiar Pantalla
		
		Escribir "Ingrese una muesta válida:"
		
		Leer muestra
		
		muestra = Mayusculas(muestra)
		
		Para i = 0 Hasta Longitud(muestra) - 1 Con Paso 1 Hacer
			
			Si (Longitud(muestra) == 9) O (Longitud(muestra) == 16) O (Longitud(muestra) == 1369) Entonces
				
				Si ((Subcadena(muestra, i, i) == "A") O (Subcadena(muestra, i, i) == "B") O (Subcadena(muestra, i, i) == "C") O  (Subcadena(muestra, i, i) == "D")) Entonces
					
					largoMuestra = Longitud(muestra)
					
					bool = Falso
					
				FinSi
				
			FinSi
			
		FinPara
		
		Limpiar Pantalla
		
		Escribir "La muestra es ingresada es: ", muestra, "."
		
		espera()
		
		Escribir "Muestra válida, inicializando arquetipos genéticos."
		
	FinMientras
	
FinSubProceso


SubProceso cargarMuestra(matriz Por Referencia, muestra Por Referencia, m)
	
	Definir i, j, contador Como Entero
	
	contador = 0
	
	Para i = 0 Hasta m - 1 Con Paso 1 Hacer
		
		Para j = 0 Hasta m - 1 Con Paso 1 Hacer
			
			matriz[i, j] = Subcadena(muestra, contador, contador)
			
			contador = contador + 1
			
		FinPara

	FinPara
	
	espera()
	
	Escribir "Carga genética completa."
	
FinSubProceso


SubProceso mostrarMuestra(matriz Por Referencia, m)
	
	Definir i, j Como Entero
	
	espera()
	
	Escribir "Imprimiendo muestra Gen-Z del paciente:"
	
	espera()
	
	Para i = 0 Hasta m - 1 Con Paso 1 Hacer
		
		Escribir Sin Saltar "| "
		
		Para j = 0 Hasta m - 1 Con Paso 1 Hacer
			
			Esperar 1 Segundos
			
			Escribir sin saltar matriz[i, j], " | "
			
		FinPara
		
		Escribir ""
		
	FinPara
	
	
FinSubProceso


SubProceso detectarGenZ(matriz Por Referencia, m)
	
	Definir i, j, contador Como Entero
	
	Definir cadenaZ, cadenaZZ, letra Como Caracter
	
	Definir diagonales Como Logico
	
	Dimension cadenaZ[m], cadenaZZ[m], diagonales[2]
	
	//Diagonal Principal.
	Para i = 0 Hasta m - 1 Con Paso 1 Hacer
		
		cadenaZ[i] = matriz[i, i]
				
	FinPara
		
	contador = m
	
	Para i = 1 Hasta m - 1 Con Paso  1 Hacer
		
		Si (cadenaZ[i - 1] <> cadenaZ[i] ) Entonces
			
			contador = contador - 1
			
		FinSi
		
	FinPara

	Si (contador <> m) Entonces
		
		diagonales[0] = Falso
		
	SiNo
		
		diagonales[0] = Verdadero
				
	FinSi

	//Diagonal Secundaria.
	contador = m - 1
	
	Para i = 0 Hasta m - 1 Con Paso 1 Hacer
		
		cadenaZZ[i] = matriz[i, contador]
		
		contador = contador - 1
		
	FinPara

	contador = m
	
	Para i = 1 Hasta m - 1 Con Paso  1 Hacer
		
		Si (cadenaZZ[i - 1] <> cadenaZZ[i] ) Entonces
			
			contador = contador - 1
			
		FinSi
		
	FinPara
	
	Si (contador <> m) Entonces
		
		diagonales[1] = Falso
		
	SiNo
		
		diagonales[1] = Verdadero
		
	FinSi
	
	espera()
	
	Escribir "Analizando Cadena Genética."
	
	espera()
	
	//Resolución.
	Si ((diagonales[0] == Verdadero) Y (diagonales[1] == Verdadero)) Entonces
		
		Escribir "El GenZ se encuentra presente en la muestra."
		
		Escribir "Debe tomar medidas urgentes para con el paciente."
		
	SiNo
		
		Escribir "El GenZ NO se encuentra presente en la muestra."
		
		Escribir "El paciente no implica riesgos para si mismo u los demás."
		
	FinSi
	
	Escribir ""
	
FinSubProceso


Algoritmo apocalipsis_zombie
	
	Definir muestra Como Caracter
	
	Definir largoMuestra, m Como Entero
	
	Definir matriz Como Caracter
	
	largoMuestra = comprobadorMuestra(muestra)
	
	Segun largoMuestra Hacer
		
		9:
			m = 3
			
		16:
			
			m = 4
			
		1369:
			
			m = 37
	
	FinSegun
	
	Dimension matriz[m, m]
	
	cargarMuestra(matriz, muestra, m)
	
	mostrarMuestra(matriz, m)
	
	detectarGenZ(matriz, m)
	
FinAlgoritmo
