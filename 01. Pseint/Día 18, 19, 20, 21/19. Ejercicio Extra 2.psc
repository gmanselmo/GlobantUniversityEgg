Algoritmo vector_promediado
	
	Definir vector, i, ingreso, promedio, largo Como Entero
	
	Escribir "Ingrese u n�mero entero: "
	
	Leer ingreso
	
	Dimension vector[ingreso]
	
	Escribir "Ingrese los n�meros: "
	
	largo = ingreso
	
	promedio = 0
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		Leer ingreso
		
		vector[i] = ingreso
		
		promedio = promedio + ingreso
		
	FinPara
	
	Escribir "El promedio de los n�meros ingresados es ", promedio / largo, "."
	
FinAlgoritmo
