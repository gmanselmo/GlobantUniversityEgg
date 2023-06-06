SubProceso inicializarMatriz(matriz Por Referencia,f por valor,c por valor)
	
	definir i,j Como Entero
	
	Para i=0 hasta f-1
		
		para j=0 hasta c-1
			
			matriz(i,j)= "*"
			
		FinPara
		
	FinPara
	
FinSubProceso


Subproceso imprimirMatriz(matriz, f Por Valor, c Por Valor)
	
	Definir i , j Como Entero
	
	Para i = 0 Hasta f-1 Hacer
		
		Para j = 0 Hasta c-1 Hacer
			
			Escribir matriz(i,j) Sin Saltar
			
		FinPara
		
		Escribir " " 
		
	FinPara
	
FinSubProceso


funcion retorno = buscarR(matriz,fila)
	
	definir i, retorno Como Entero
	
	retorno=0
	
	i=0
	
	hacer
		
		retorno=retorno+1
		
		i=i+1
		
	mientras que i<=11 y matriz(fila,i)<>"R"
	
FinFuncion


SubProceso acomodarPalabra(matriz Por Referencia)
	
	definir i,j,posicion Como Entero
	
	para i=0 hasta 8
		
		posicion=5-buscarR(matriz,i)
		
		para j=11 hasta 0 con paso -1
			
			si j-posicion>=0 Entonces
				
				matriz(i,j)=matriz(i,j-posicion)
				
			FinSi
			
			si j-posicion<0 Entonces
				
				matriz(i,j)="*"
				
			FinSi
			
		FinPara
		
	FinPara
	
FinSubProceso


SubProceso agregarPalabra(matriz Por Referencia, f Por Valor, C Por Valor)
	
	Definir i,j, cont Como Entero
	
	Definir palabra Como Caracter
	
	cont=0
	
	para i <- 0 hasta 8 Hacer
		cont = 0
		Segun i Hacer
			0: 
				palabra= "VECTOR"
			1:
				palabra= "MATRIX"
			2:
				palabra= "PROGRAMA"
			3:
				palabra= "SUBPROGRAMA"
			4:
				palabra= "SUBPROCESO"
			5:
				palabra= "VARIABLE"
			6:
				palabra= "ENTERO"
			7: 
				palabra= "PARA"
			8:
				palabra= "MIENTRAS"
				
		FinSegun
		
		para j <- 0 hasta Longitud(palabra)-1 hacer
			
			matriz[i,j] = Subcadena(palabra, cont, cont)
			
			cont = cont +1
			
			escribir Sin Saltar Mayusculas(matriz[i,j]) " "
			
		FinPara
		
		escribir ""
		
	FinPara
	
FinSubProceso


Algoritmo crucigrama
	
	Definir matriz Como Caracter
	
	Definir f, c Como Entero
	
	f = 9
	c = 12
	
	Dimension matriz[f, c]
	//Inizializar matriz.
	inicializarMatriz(matriz, f, c)
	
	//Imprimir matriz.
	imprimirMatriz(matriz, f, c)
	
	//Agregar palabra.
	agregarPalabra(matriz, f, c)
	
	//Acomodar las palabras en la R.
	acomodarPalabra(matriz)
	
	//Imprimir nueva matriz acomodada.
	imprimirMatriz(matriz, f, c)

FinAlgoritmo
