Algoritmo eficiencia
	
	Definir defectuosos, aptos Como Entero
	
	Escribir "Ingrese primero los tornillos defectuosos y luego los aptos para la venta: "
	
	Leer defectuosos, aptos
	
	Si (defectuosos > 200) Y (aptos < 10000) Entonces
		Escribir "Empleado grado 5"
	SiNo
		Si (defectuosos < 200) Y (aptos < 10000)Entonces
			Escribir "Empleado grado 6"
		SiNo
			Si (defectuosos > 200) Y (aptos > 10000) Entonces
				Escribir "Empleado grado 7"
			SiNo
				Si (defectuosos < 200) Y (aptos > 10000) Entonces
					Escribir "Empleado grado 8"
					
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
