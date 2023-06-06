Algoritmo sueldos
	
	Definir costoHora, horasTrabajadas, comision Como Real
	Definir ingreso Como Caracter
	
	Escribir "Seleccione una opción: "
	Escribir "a) comisión." 
	Escribir "b) salario fijo + comisión."  
	Escribir "c) salario fijo." 
	
	Leer ingreso
	
	Si (Mayusculas(ingreso) = "A") Entonces
		Escribir "Ingrese el total de ventas semanales: "
		Leer comision
		Escribir "El salario es $", comision * 0.4
	SiNo
		Si (Mayusculas(ingreso) = "B") Entonces
			Escribir "Ingrese en orden el $/hora, la cantidad de horas trabajadas y el monto ventas semanal: "
			Leer costoHora, horasTrabajadas, comision
			Si (horasTrabajadas > 40) Entonces
				Escribir "El salario es $", (costoHora * 40) + (comision * 0.25)
			SiNo
				Si (horasTrabajadas < 41) Entonces
					Escribir "El salario es $", (costoHora * horasTrabajadas) + (comision * 0.25)
				FinSi
			FinSi
		SiNo
			Si (Mayusculas(ingreso) = "C") Entonces
				Escribir "Ingrese en orden el $/hora, la cantidad de horas trabajadas: "
				Leer costoHora, horasTrabajadas
				Si (horasTrabajadas < 41) Entonces
					Escribir "El salario es $", costoHora * horasTrabajadas
				SiNo
					Escribir "El salario es $", (costoHora * 40) + ((costoHora * 0.5) * (horasTrabajadas - 40))
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
