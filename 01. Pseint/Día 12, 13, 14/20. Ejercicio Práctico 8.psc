Funcion respuesta <- Login ( user, password, intentos )
	
	Definir respuesta Como Logico
	
	Si (user = "usuario1") Y (password = "asdasd")
		
		respuesta = Verdadero
		
	SiNo
		
		respuesta = Falso
		
	FinSi
	
Fin Funcion

Algoritmo sesion
	
	Definir user, password Como Caracter
	
	Definir intentos Como Entero
	
	Definir respuesta Como Logico
	
	intentos = 3
	
	Mientras (intentos != 0) Hacer
		
		Escribir "Ingrese su usario: "
		
		Leer user
		
		Escribir "Ingrese su contraseña: "
		
		Leer password
		
		respuesta = Login(user, password, intentos)
		
		Si (respuesta = Falso) Entonces
			
			intentos = intentos - 1
		SiNo
			
			Escribir "Welcome."
			
		FinSi
		
		Si (intentos = 0) Entonces
			
			Escribir "Ha intentado demasiadas veces, vuelva luego."
			
		FinSi
		
	FinMientras
	
FinAlgoritmo


