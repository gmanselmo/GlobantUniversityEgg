Algoritmo descuentos
	
	Definir mes, importe Como Real
	
	Escribir "Ingrese el número de mes de compra y luego el importe: "
	
	Leer mes, importe
	
	Si (mes = 9) O (mes = 10) O (mes = 11) Entonces
		Escribir "El monto final es $", importe * 0.9
	SiNo
		Escribir "El monto final es $", importe		
	FinSi
	
FinAlgoritmo
