Algoritmo comisiones_vendedor
	
	Definir i, j, cantidadVendedores, ventas Como Entero
	Definir sueldoBase, precioVenta, comision, sueldoTotal, comisionesVendedor Como Real
	
	Escribir "Ingrese el número de vendedores: "
	
	Leer cantidadVendedores
	
	comisionesVendedor = 0
	
	Para i = 1 hasta cantidadVendedores Con Paso 1 hacer
		
		Escribir "Ingrese el sueldo base del vendedor: "
		
		Leer sueldoBase
		
		Escribir "Ingrese la cantidad de ventas realizadas por el vendedor: "
		
		Leer ventas
		
		Para j = 1 hasta ventas Con Paso 1 hacer
			
			Si (ventas <> 0) Entonces
				
				Escribir "Ingrese el precio de cada venta: "
				
				Leer precioVenta
				
				comision = 0.1 * precioVenta
				
				comisionesVendedor = comisionesVendedor + comision
				
			FinSi
					
		Fin Para
		
		sueldoTotal = sueldoBase + comisionesVendedor
		
		Escribir "El vendedor debe recibir ", comisionesVendedor, " de comisiones."
		
		Escribir "El sueldo total del vendedor es $", sueldoTotal
		
		comisionesVendedor = 0
		
	Fin Para
	
Fin Algoritmo
