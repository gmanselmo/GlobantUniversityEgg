Algoritmo desayuno
	
	Definir ingreso, tipoCafe, tipoLeche Como Caracter
	
	Escribir "Desea tomar te o cafe?"
	
	Leer ingreso
	
	Si Mayusculas(ingreso) = "TE" Entonces
		Escribir "Genial, un t�."
	SiNo
		Si (Mayusculas(ingreso) = "CAFE") Entonces
			Escribir "Solo o cortado?: "
			Leer tipoCafe
			Si (Mayusculas(tipoCafe) = "CORTADO") Entonces
				Escribir "Prefiere leche vegetal? (si o no): "
				Leer tipoLeche
				Si (Mayusculas(tipoLeche) = "SI") Entonces
					Escribir "Genial, un caf� cortado con leche vegetal."
				SiNo
					Escribir "Genial, caf� cortado con leche de vaca."
					
				FinSi
			SiNo
				Escribir "Genial, un caf� solo."
			FinSi
		FinSi
	FinSi
		
FinAlgoritmo
