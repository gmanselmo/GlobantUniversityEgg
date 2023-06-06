SubProceso CargarVentasRegion(ventasRegion Por Referencia)
	
	Definir i, j, total Como Entero
	
	total = 0
	
	Para i = 0 Hasta 3 Con Paso 1 Hacer
		
		Para j = 0  Hasta 5 Con Paso 1 Hacer
			
			Si (j <= 4) Entonces
				
				Limpiar Pantalla
				
				Escribir "Ingrese las ventas del vendedor ", i + 1, " en orden de Regiones (Norte, Sur, Este, Oeste y Centro):"
				
				Leer ventasRegion[i, j]	
				
				total = total + ventasRegion[i, j]
				
			SiNo
				
				Si (j == 5) Entonces
					
					ventasRegion[i, j] = total
					
				FinSi				
				
			FinSi
			
		FinPara
		
		total = 0
		
	FinPara
	
	Limpiar Pantalla
	
	Escribir "|    Nescafé   | Norte | Sur | Este | Oeste | Centro | Tot. Vendor |"
	
	Para i = 0 Hasta 3 Hacer
		
		Escribir Sin Saltar "|  Vendedor ", i + 1, "  |    "
		
		Para j = 0 Hasta 5 Hacer
			
			Escribir sin saltar ventasRegion[i, j], "  |     "
			
		FinPara
		
		Escribir ""
		
	FinPara

FinSubProceso


SubProceso TotalVendedor(ventasRegion Por Referencia, TotalVentasRegion Por Referencia)
	
	Definir i, j, total Como Entero
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer


		TotalVentasRegion[i] = ventasRegion[0, i] + ventasRegion[1, i] + ventasRegion[2, i] + ventasRegion[3, i]
		
	FinPara
	
	Escribir Sin Saltar "| Total Región | "
	
	Para i = 0 Hasta 5 Con Paso 1 Hacer
					
		Escribir Sin Saltar TotalVentasRegion[i], "     |  "
			
	FinPara
	
FinSubProceso


Algoritmo matriz_regional
	
	Definir ventasRegion, TotalVentasRegion Como Entero
	
	Dimension ventasRegion[4, 6], TotalVentasRegion[6]
	
	CargarVentasRegion(ventasRegion)
	
	TotalVendedor(ventasRegion, TotalVentasRegion)
	
	Escribir ""

FinAlgoritmo
