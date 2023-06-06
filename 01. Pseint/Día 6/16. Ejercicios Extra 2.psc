Algoritmo fecha_valida
	
	Definir dd, mm, yyyy Como Entero
	
	Escribir "Ingrese en orden un número de día, luego mes y luego año: "
	
	Leer dd, mm, yyyy
	
	Si (dd > 31) Y (mm > 12)
		Escribir "Fecha inválida."
	SiNo
		Segun mm Hacer
			1:
				Escribir dd, " de enero de ", yyyy
			2:
				Escribir dd, " de febrero de ", yyyy
			3:
				Escribir dd, " de marzo de ", yyyy
			4:
				Escribir dd, " de abril de ", yyyy
			5:
				Escribir dd, " de mayo de ", yyyy
			6:
				Escribir dd, " de junio de ", yyyy
			7:
				Escribir dd, " de julio de ", yyyy
			8:
				Escribir dd, " de agosto de ", yyyy
			9:
				Escribir dd, " de septiembre de ", yyyy
			10:
				Escribir dd, " de octubre de ", yyyy
			11:
				Escribir dd, " de noviembre de ", yyyy
			12:
				Escribir dd, " de diciembre de ", yyyy
		FinSegun
		
	FinSi
FinAlgoritmo
