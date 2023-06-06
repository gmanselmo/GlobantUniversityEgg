Funcion sueldoDia <- CalculadoraLaboral(dia, turno, horas, feriado)
	
	Definir sueldoDia Como Real
	
	Si (turno = "nocturno") Y (feriado = "no") Entonces
		
		sueldoDia = horas * 125
	SiNo
		Si (turno = "nocturno") Y (feriado = "si") Entonces
			
			sueldoDia = horas * 125 + horas * 125 * 0.15
		SiNo
			Si (turno = "diurno") Y (feriado = "no") Entonces
				
				sueldoDia = horas * 90
			SiNo
				Si (turno = "diurno") Y (feriado = "si") Entonces
					
					sueldoDia = horas * 90 + horas * 90 * 0.10
				FinSi
			FinSi
		FinSi
	FinSi
	
Fin Funcion

Algoritmo calculadora__jornales
	
	Definir trabajador, dia, turno, feriado Como Caracter
	
	Definir horas Como Entero
	
	Definir calculo Como Real
	
	Escribir "Ingrese el nombre del trabajador: "
	
	Leer trabajador
	
	Escribir "Ingrese el día trabajado: "
	
	Leer dia
	
	Escribir "Ingrese el turno: "
	
	Leer turno
	
	Escribir "Ingrese las horas trabajadas: "
	
	Leer horas
	
	Escribir "Era día feriado?: "
	
	Leer feriado
	
	calculo = CalculadoraLaboral(dia, turno, horas, feriado)
	
	Escribir "Al trabajador ", trabajador, "por su trabajo el día ", dia, " le corresponde un jornal de $", calculo
	
FinAlgoritmo
