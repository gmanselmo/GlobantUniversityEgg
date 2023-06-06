Algoritmo buscador
	
	Definir vector, i, lenght, ingreso, dato Como Entero
	
	Definir contador Como Logico
	
	Escribir "Ingrese un número: "
	
	Leer lenght
	
	Dimension vector[lenght]
	
	Escribir "Ingrese la cantidad de números deseada: "
	
	Para i <- 0 Hasta lenght - 1 Con Paso 1 Hacer
		
		Leer ingreso
		
		vector[i] = ingreso
		
	FinPara
	
	Escribir "Ingrese un número a buscar en el vector: "
	
	Leer ingreso
	
	contador = Verdadero
	
	Para i <- 0 Hasta lenght - 1 Con Paso 1 Hacer
		
		dato = vector[i]
		
		Si (ingreso == dato) Entonces
			
			Escribir "El número se encuentra en la posición: ", i + 1, ". Indice: ", i, "."
			
			contador = Falso
			
		FinSi
		
	FinPara
	
	Si (contador == Verdadero) Entonces
		
		Escribir "El número no se encuentra en el arreglo."
		
	FinSi
	
FinAlgoritmo
