Algoritmo llantas
	
	Definir cantidad Como Entero
	
	Escribir "Ingrese la cantidad de llantas compradas: "
	
	Leer cantidad
	
	Si (cantidad < 5) Entonces
		Escribir "Valor de cada llanta: $3000. Total : $", cantidad * 3000
	SiNo
		Si (cantidad > 4) Y (cantidad < 11) Entonces
			Escribir "Valor de cada llanta: $2500. Total : $", cantidad * 2500
		SiNo
			Si (cantidad > 10) Entonces
				Escribir "Valor de cada llanta: $2000. Total : $", cantidad * 2000
			FinSi
		FinSi
	FinSi
		
FinAlgoritmo
