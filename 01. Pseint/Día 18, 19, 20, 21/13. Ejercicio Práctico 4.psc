Algoritmo MenuVectores
	
    Definir menu, vectorA, ingreso, vector, vectorB, vectorC, VA, VB, VC Como Entero
	
	Escribir "Ingrese la longitud de los vectores: "
	
	Leer ingreso
    
	Dimension vectorA[ingreso]
	
	Dimension vectorB[ingreso]
	
	Dimension vectorC[ingreso]
	
    Hacer
        Escribir ""
        Escribir "MENU VECTORES"
        Escribir "1. Llenar Vector A"
        Escribir "2. Llenar Vector B"
        Escribir "3. Sumar Vectores A y B"
        Escribir "4. Restar Vectores B y A"
        Escribir "5. Mostrar Vector"
        Escribir "6. Salir"
        Escribir ""
        Escribir "Ingrese una opción:"
		
		Leer menu
		
        Segun menu Hacer
            1:				
				LlenarVectorAleatorioA(vectorA, ingreso)
				
            2:	
				LlenarVectorAleatorioB(vectorB, ingreso)
				
			3:
				LLenarVectorCSumaAB(vectorA, vectorB, vectorC, ingreso)
				
			4:
				LLenarVectorCRestaBA(vectorA, vectorB, vectorC, ingreso)
				
			5:	
				Hacer
					
					Escribir ""
					Escribir "MOSTRAR VECTORES"
					Escribir "1. Mostrar Vector A"
					Escribir "2. Mostrar Vector B"
					Escribir "3. Mostrar Vector C"
					Escribir "4. Salir"
					Escribir ""
					Escribir "Ingrese una opción:"
					
					Leer menu
					
					Segun menu Hacer
						1:
							Mostradora(vectorA, ingreso)
							
						2:
							Mostradora(vectorB, ingreso)
							
						3:
							Mostradora(vectorC, ingreso)
							
						De Otro Modo:
							Escribir "Opción inválida, ingrese de nuevo."
					Fin Segun
					
					
				Mientras Que ((menu < 4) O (menu > 4))

			6: 
				Escribir "Gracias por usar."
				
            De Otro Modo:
                Escribir "Opción inválida, ingrese de nuevo."
				
        FinSegun
		
    Mientras Que ((menu < 6) O (menu > 6))
	
	Definir j Como Entero
	
FinAlgoritmo


SubProceso LlenarVectorAleatorioA (vectorA, ingreso)
	
	Definir i Como Entero
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		vectorA[i] = Aleatorio(-100, 100)
		
		Escribir Sin Saltar vectorA[i], " "
		
	FinPara
	
	Escribir "El vector ha sido llenado de manera aleatoria."
	
FinSubProceso

SubProceso LlenarVectorAleatorioB (vectorB, ingreso)
	
	Definir i Como Entero
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		vectorB[i] = Aleatorio(-100, 100)
		
		Escribir Sin Saltar vectorB[i], " "
		
	FinPara
	
	Escribir "El vector ha sido llenado de manera aleatoria."
	
FinSubProceso

SubProceso LLenarVectorCSumaAB (vectorA, vectorB, vectorC, ingreso)
	
	Definir i Como Entero
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		vectorC[i] = vectorA[i] + vectorB[i]
		
		Escribir Sin Saltar vectorC[i], " "
		
	FinPara
	
	Escribir "El vector ha sido llenado con la suma de los vectores A y B."
	
FinSubProceso

SubProceso LLenarVectorCRestaBA (vectorA, vectorB, vectorC, ingreso)
		
	Definir i Como Entero
	
	Para i = 0 Hasta ingreso - 1 Con Paso 1 Hacer
		
		vectorC[i] = vectorB[i] - vectorA[i]
		
		Escribir Sin Saltar vectorC[i], " "
		
	FinPara
	
	Escribir "El vector ha sido llenado con la resta de los vectores B y A."
	
FinSubProceso

SubProceso Mostradora(vector, ingreso)
	
	Definir i Como Entero
	
	i = 0
	
	Escribir Sin Saltar "["
	Para i = 0 Hasta ingreso - 2 Con Paso 1 Hacer
		Escribir Sin Saltar vector[i], ", "
	FinPara
	Escribir Sin Saltar vector[ingreso - 1]
	Escribir Sin Saltar "]"
	i = 0
	
FinSubProceso
