SubProceso entreMyT(letra)
	
	Si (letra > "M") Y (letra < "T") Entonces
		
		Escribir "La letra está entre la M y la T."
		
	FinSi
	
FinSubProceso

Algoritmo esta_entre_m_y_t
	
	Definir letra Como Caracter
	
	Escribir "Ingrese una letra: "
	
	Leer letra
	
	entreMyT(letra)
	
FinAlgoritmo
