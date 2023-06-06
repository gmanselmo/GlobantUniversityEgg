Algoritmo promedios
	
	Definir  nota1, nota2, nota3, nota4, eliminada Como Real
	
	Escribir "Ingrese las 4 notas sin importar el órden: "
	
	Leer nota1, nota2, nota3, nota4
	
	Si (nota1 <= nota2) Y (nota1 <= nota3) Y (nota1 <= nota4)
		eliminada = nota1
	SiNo
		Si (nota2 <= nota1) Y (nota2 <= nota3) Y (nota2 <= nota4)
			eliminada = nota2
		SiNo
			Si (nota3 <= nota1) Y (nota3 <= nota2) Y (nota3 <= nota4)
				eliminada = nota3
			SiNo
				eliminada = nota4
			FinSi
		FinSi
	FinSi
	
	Escribir "La nota más baja eliminada es: ", eliminada
	Escribir "El promedio es: ", (nota1 + nota2 + nota3 + nota4 - eliminada) / 3
	
FinAlgoritmo
