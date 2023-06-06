Algoritmo precio_producto
	
	Definir precio1, precio2, porcentaje Como Real
	
	Escribir "Ingrese el valor del producto a inicio de año: "
	Leer precio1
	
	Escribir "Ingrese el valor del producto a final de año: "
	Leer precio2
	
	porcentaje = ((100 * precio2) / precio1) - 100
	
	Escribir "El aumento anual del producto fue del ", porcentaje, "%."
	
FinAlgoritmo
