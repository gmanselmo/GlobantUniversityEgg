Algoritmo buscador
	
	Definir vector, i, lenght, ingreso, dato Como Entero
	
	Definir contador Como Logico
	
	Escribir "Ingrese un n�mero: "
	
	Leer lenght
	
	Dimension vector[lenght]
	
	Escribir "Ingrese la cantidad de n�meros deseada: "
	
	Para i <- 0 Hasta lenght - 1 Con Paso 1 Hacer
		
		Leer ingreso
		
		vector[i] = ingreso
		
	FinPara
	
	Escribir "Ingrese un n�mero a buscar en el vector: "
	
	Leer ingreso
	
	contador = Verdadero
	
	Para i <- 0 Hasta lenght - 1 Con Paso 1 Hacer
		
		dato = vector[i]
		
		Si (ingreso == dato) Entonces
			
			Escribir "El n�mero se encuentra en la posici�n: ", i + 1, ". Indice: ", i, "."
			
			contador = Falso
			
		FinSi
		
	FinPara
	
	Si (contador == Verdadero) Entonces
		
		Escribir "El n�mero no se encuentra en el arreglo."
		
	FinSi
	
FinAlgoritmo
