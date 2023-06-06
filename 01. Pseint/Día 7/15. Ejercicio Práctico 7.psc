Algoritmo promediador
	
	Definir practica, problemas, teorica Como Enteros
	Definir promedio Como Real
	Definir nombre Como Caracter
	
	Escribir "Ingrese el nombre del alumno y luego las 3 calificaciones o cadena vacia para terminar"
	
	Leer nombre
	
	Mientras (nombre <> "") Hacer
		
		Escribir "Ingrese las 3 notas en orden: "
		
		Leer practica, problemas, teorica
		
		Si (practica < 0) o (practica > 10) o (problemas < 0) o (problemas > 10) o (teorica < 0) o (teorica > 10) Entonces
			Escribir "Error: las notas deben estar entre 0 y 10." 
		SiNo
			promedio = practica * 0.1 + problemas * 0.5 + teorica * 0.4
			
			Escribir "La nota del alumno ", nombre, " es ", promedio
			
			Escribir "Ingrese el nombre del siguiente alumno (o cadena vacía para terminar): "
			Leer nombre
		FinSi
		
	Fin Mientras
FinAlgoritmo
