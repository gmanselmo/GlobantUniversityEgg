Algoritmo notas
	
	Definir nota1, nota2, nota3 Como Entero
	Definir correctas Como Logico
	
	Escribir "Ingrese 3 calificaciones: "
	
	Leer nota1, nota2, nota3
	
	Si (nota1 >= 1) Y (nota1 <= 10) Y (nota2 >= 1) Y (nota2 <= 10) Y (nota3 >= 1) Y (nota3 <= 10) Entonces
		correctas = Verdadero
	SiNo
		correctas = Falso
	FinSi
	
	Si (correctas = Verdadero) Entonces
		Escribir "Las notas son correctas"
	SiNo
		Escribir "Las notas son incorrectas"
		
	FinSi
	
FinAlgoritmo
