Algoritmo numeros_teclado
	
	Definir ingreso, numeroMaximo, numeroMinimo, suma, contador Como Entero
	
	numeroMaximo = 0
	
	numeroMinimo = 0
	
	suma = 0
	
	contador = -1
	
	ingreso = 0
	
	Hacer
		
		Si (numeroMaximo = 0) O (numeroMinimo = 0) Entonces
			
			numeroMaximo = ingreso
			
			numeroMinimo = ingreso
			
		FinSi
		
		Escribir "Ingrese un número entero o ingrese 0 para terminar"
		
		Leer ingreso
		
		suma = suma + ingreso
		
		contador = contador + 1
		
		Si (ingreso > numeroMaximo) Entonces
			
			numeroMaximo = ingreso
			
		SiNo
			Si (ingreso < numeroMinimo) Y (ingreso > 0) Entonces
				
				numeroMinimo = ingreso
			
			FinSi
		FinSi
		
	Mientras Que (ingreso > 0)
	
	Escribir "El número mínimo es: ", numeroMinimo
	Escribir "El número máximo es: ", numeroMaximo
	Escribir "El promedio es: ", (suma / contador)
	
FinAlgoritmo
	