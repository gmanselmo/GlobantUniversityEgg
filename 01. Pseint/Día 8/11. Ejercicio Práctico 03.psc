Algoritmo sesion
	
	Definir ingresoCodigo, ingresoContrasenia, codigo, contrasenia Como Entero;
	Definir bool Como Logico
	
	contrasenia = 4567
	codigo = 1024
	
	Hacer
		
		Escribir "Ingrese su c�digo de usuario y luego su contrase�a: "
		
		Leer ingresoCodigo, ingresoContrasenia
		
		Si (contrasenia <> ingresoContrasenia)
			
			Escribir "Ingreso erroneo."
			
		FinSi
		

	Mientras Que (contrasenia <> ingresoContrasenia) O (codigo <> ingresoCodigo)
	
	Escribir "Inicio correcto."
	
FinAlgoritmo
