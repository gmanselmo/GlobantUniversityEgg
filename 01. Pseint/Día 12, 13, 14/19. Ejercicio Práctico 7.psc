Funcion casteado <- ConversorANumero ( numStr )
	
	Definir casteado Como Entero
	
	casteado = ConvertirANumero(numStr) 
	
Fin Funcion

Algoritmo convertidor
	
	Definir numStr Como Caracter
	
	Definir casteado Como Entero
			
	Escribir "Ingrese un número: "
	
	Leer numStr
	
	Si (Longitud(numStr) >= 1) Y (Longitud(numStr) <= 3) Entonces
		
		casteado = ConversorANumero (numStr)
		
		Escribir casteado
		
	FinSi
	
FinAlgoritmo
