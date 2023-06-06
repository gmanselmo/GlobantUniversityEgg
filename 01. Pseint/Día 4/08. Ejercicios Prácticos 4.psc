Algoritmo capicua
	
	Definir num, centena, decena, unidad Como Entero;
	
	Escribir "Ingrese un número: ";
	
	Leer num;
	
	centena = trunc(num / 100)
	unidad = num mod 10
	
	Si (centena == unidad) Entonces;
		Escribir "Es capicúa";
	SiNo
		Escribir "No es capicúa";
	FinSi
	
FinAlgoritmo
