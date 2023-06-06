Algoritmo vocal_secreta
	
	Definir vocalSecreta, ingreso Como Caracter
	
	vocalSecreta = "A"
	
	Escribir "Adivine la vocal secreta: "
	Leer ingreso
	
	Mientras Mayusculas(ingreso) <> vocalSecreta Hacer
		
		Escribir "Ingrese otra vocal: "
		
		Leer ingreso
		
	FinMientras
	
	Escribir "Adivinaste la vocal secreta, era ", ingreso
	
FinAlgoritmo
