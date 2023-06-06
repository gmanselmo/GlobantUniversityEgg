SubProceso CargarVentasDiarias(ventasDiarias Por Referencia)
	
	Definir i, j, total Como Entero
	
	total = 0
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Para j = 0  Hasta 5 Con Paso 1 Hacer
			
			Si (j <= 4) Entonces
				
				Limpiar Pantalla
				
				Escribir "Ingrese las ventas del Producto ", i + 1, " en el día ", j + 1
				
				Leer ventasDiarias[i, j]	
				
				total = total + ventasDiarias[i, j]
				
			SiNo
				
				Si (j == 5) Entonces
					
					ventasDiarias[i, j] = total
					
				FinSi				
				
			FinSi
			
		FinPara
		
		total = 0
		
	FinPara
	
	Limpiar Pantalla
	
	Escribir "|      ---     | Lunes | Martes | Miercoles | Jueves | Viernes | Total Producto |"
	
	Para i = 0 Hasta 4 Hacer
		
		Escribir Sin Saltar "|  Producto ", i + 1, "  |    "
		
		PAra j = 0 Hasta 5 Hacer
			
			Escribir sin saltar ventasDiarias[i, j], "  |     "
			
		FinPara
		
		Escribir ""
		
	FinPara
	
FinSubProceso


SubProceso TotalSemana(ventasDiarias Por Referencia, TotalVentasSemana Por Referencia)
	
	Definir i, j, total Como Entero
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		
		Si (i == 5) Entonces
			
			TotalVentasSemana[i] = 0
			
		SiNo
			
			TotalVentasSemana[i] = ventasDiarias[0, i] + ventasDiarias[1, i] + ventasDiarias[2, i] + ventasDiarias[3, i] + ventasDiarias[4, i]
					
		FinSi
		
		
	FinPara
	
	Escribir Sin Saltar "| Total Semana | "
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		
		Si (i == 5) Entonces
			
			Escribir Sin Saltar ""
			
		SiNo
			 
			Escribir Sin Saltar TotalVentasSemana[i], "    |  "
			
		FinSi

	FinPara
	
FinSubProceso


SubProceso MasVendido(ventasDiarias Por Referencia, TotalVentasSemana Por Referencia, productoMasVendido Por Referencia)
	
	Definir i, j, mayor, mayorDiario, producto Como Entero
	
	Dimension mayorDiario[6], producto[6]
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		
		mayorDiario[i] = 0
		
	FinPara
		
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		
		Para j = 0 Hasta 5 Con Paso 1 Hacer
			
			Si (ventasDiarias[i, j] > mayorDiario[j]) Entonces
				
				mayorDiario[j] = ventasDiarias[i, j]
				
				producto[j] = i + 1
				
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir Sin Saltar "| Pr + Vendido | "
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		
		Si (i == 5) Entonces
			
			Escribir Sin Saltar ""
			
		SiNo
			
			Escribir Sin Saltar "Prod ", producto[i], " | "
			
		FinSi
		
	FinPara
	
FinSubProceso


Algoritmo matriz_logistica
	
	Definir ventasDiarias, TotalVentasSemana, productoMasVendido Como Entero
	
	Dimension ventasDiarias[5, 6], TotalVentasSemana[6], productoMasVendido[6]
		
	//Llenar precios.
	CargarVentasDiarias(ventasDiarias)
	
	//Suma Total Semanal Por Producto.
	TotalSemana(ventasDiarias, TotalVentasSemana)
	
	//Mayor diario.
	Escribir ""
	
	MasVendido(ventasDiarias, TotalVentasSemana, productoMasVendido)
	
	Escribir ""
	
FinAlgoritmo
