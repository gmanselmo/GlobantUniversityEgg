Algoritmo clave
	
	Definir ingreso, password, intento Como Caracter
	Definir contador Como Entero
	Definir bool Como Logico
	
	contador = 0
	password = "eureka"
	bool = Verdadero
	
	Hacer
		Escribir "Ingrese la clave secreta: "
		
		Leer ingreso
		
		contador = contador + 1
		
		Si (Minusculas(ingreso) <> password) Y (contador = 3)Entonces
			
			Escribir "Fallaste."
			
			bool = Falso
			
		FinSi
		
	Mientras Que (contador <= 3) Y (Minusculas(ingreso) <> password) Y (bool <> Falso)
	
	Si (contador <= 3) Y (Minusculas(ingreso) = password) Entonces
		
		Escribir "Correcto."
	FinSi
	
FinAlgoritmo
