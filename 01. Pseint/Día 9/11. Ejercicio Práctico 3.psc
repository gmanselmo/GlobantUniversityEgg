Algoritmo promedios_alumnos
	
	Definir notaIntegrador, notaExposicion, notaParcial, notaPromedio, sumaPromedioReprobados, notaExposicionMayor, alumnosPorcentajeIntegradorAlto Como Real
	Definir cantidadEstudiantes, i, parcialMedio, alumnosReprobados Como Entero
	
	Escribir "Ingrese la cantidad de estudiantes: "
	
	Leer cantidadEstudiantes
	
	Escribir cantidadEstudiantes
	
	notaPromedio = 0
	
	sumaPromedioReprobados = 0
	
	alumnosPorcentajeIntegradorAlto = 0
	
	notaExposicionMayor = 0
	
	parcialMedio = 0
	
	alumnosReprobados = 0
	
	Para i = 0 Hasta (cantidadEstudiantes - 1) Con Paso 1 Hacer
		
		Escribir "Ingrese las notas del Integrador, la Exposición y el Parcial en orden: "
		
		Leer notaIntegrador, notaExposicion, notaParcial
		
		notaPromedio = (notaIntegrador * 0.35) + (notaExposicion * 0.25) + (notaParcial * 0.4)
				
		Si (notaPromedio < 6.5) Entonces
			
			sumaPromedioReprobados = sumaPromedioReprobados + notaPromedio
			
			alumnosReprobados = alumnosReprobados + 1
			
		FinSi
					
		Si (notaIntegrador > 7.5) Entonces
			
			alumnosPorcentajeIntegradorAlto = alumnosPorcentajeIntegradorAlto + 1
			
		FinSi
		
		Si (notaExposicionMayor < notaExposicion) Entonces
			
			notaExposicionMayor = notaExposicion
				
		FinSi
		
		Si (notaParcial >= 4) Y (notaParcial <= 7.5) Entonces
			
			parcialMedio = parcialMedio + 1
		FinSi

	FinPara
	
	sumaPromedioReprobados = sumaPromedioReprobados / alumnosReprobados
	
	Escribir "La nota final promedio de los reprobados es ", sumaPromedioReprobados
	Escribir "El porcentaje de estudiantes con un trabajo integrador con más de 7.5 es %", (alumnosPorcentajeIntegradorAlto * 100) / cantidadEstudiantes
	Escribir "La mayor nota en las exposiciones es ", notaExposicionMayor
	Escribir "La cantidad de alumnos con un parcial entre 4 y 7.5 es ", parcialMedio
	
FinAlgoritmo
