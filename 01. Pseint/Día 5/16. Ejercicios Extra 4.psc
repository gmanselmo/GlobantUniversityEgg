Algoritmo transporte
	
	Definir horasUso, litros, calculo Como Real
	
	Escribir "Ingrese el tiempo de uso en horas y los litros de combustible gastados: "
	
	Leer horasUso, litros
	
	Si (horasUso <= 2)
		Escribir "El total a pagar es de $400"
	SiNo
		calculo = (40 * litros) + (horasUso * 60 * 5.20)
		Escribir "El total a pagar es de $", calculo
	FinSi
		
FinAlgoritmo
