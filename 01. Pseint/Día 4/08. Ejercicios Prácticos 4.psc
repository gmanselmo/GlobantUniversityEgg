Algoritmo capicua
	
	Definir num, centena, decena, unidad Como Entero;
	
	Escribir "Ingrese un n�mero: ";
	
	Leer num;
	
	centena = trunc(num / 100)
	unidad = num mod 10
	
	Si (centena == unidad) Entonces;
		Escribir "Es capic�a";
	SiNo
		Escribir "No es capic�a";
	FinSi
	
FinAlgoritmo
