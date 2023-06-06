Algoritmo CalculadoraMateriales
	
	menu();
	
FinAlgoritmo

SubProceso menu()
	Definir op como Entero
	//
	//
	Escribir "presione una techa para continuar"
    Esperar Tecla
	Limpiar Pantalla
	Escribir "Bienvenidos a la calculadora de materiales del  Equipo 72!"
	Escribir "1. Calcular muro de ladrillo"
	Escribir "2. Calcular viga de hormigón"
	Escribir "3. Calcular columnas de hormigón"
	Escribir "4. Calcular contrapisos"
	Escribir "5. Calcular techo"
	Escribir "6. Calcular pisos"
	Escribir "7. Calcular pintura"
	Escribir "8. Calcular iluminación"
	Escribir "9. Salir"
	Escribir ""
	Escribir "Seleccione una opción:"
	Leer op
	Limpiar Pantalla
	
	Segun op
		1:
			calcularMuro()
			menu()
		2:
			calcularViga()
			menu()
		3:
			calcularColumna()
			menu()
		4:
			calcularContrapisos()
			menu()
		5:
			calcularTecho()
			menu()
		6:
			calcularPiso()
			menu()
		7:
			calcularPintura()
			menu()
		8:
			calcularIluminacion()
			menu()
		9:
			Escribir Sin Saltar "Saliendo"
			Esperar 1 segundo
			Escribir Sin Saltar "."
			Esperar 1 segundo
			Escribir Sin Saltar "."
			Esperar 1 segundo
			Escribir Sin Saltar "."
			Escribir " "
			
		De Otro Modo:
			menu()
	FinSegun
	
FinSubProceso

SubProceso superficie <- calcularSuperficie (largo, ancho)
	Definir superficie Como Real 
	superficie=ancho*largo	
FinSubProceso

SubProceso volumen <- calcularVolumen (largo, ancho, altura)
	Definir volumen Como Real 
	volumen=ancho*largo*altura
FinSubProceso

SubProceso calcularMuro()
	Definir espesor, largo, alto, superficie, cemento, arena, ladrillos como real 
	Escribir "¿cuanto tiene el espesor del muro (20 o 30 cm)?"
	leer espesor 
	segun espesor hacer 
		20: 
			cemento =10.9
			arena= 0.09
			ladrillos=90
			Escribir "ingrese el largo"
			leer largo
			Escribir "ingrese el alto"
			leer alto 
			superficie = calcularSuperficie(largo, alto)
			Escribir "la superficie es: ", superficie
			Escribir "materiales: cemento: ", cemento * superficie, "m3 de arena: ", arena * superficie, "m2 de ladrillo: ", superficie * ladrillos 
		30: 
			cemento =15.2
			arena= 0.115
			ladrillos=120
			Escribir "ingrese el largo"
			leer largo
			Escribir "ingrese el alto"
			leer alto 
			superficie = calcularSuperficie(largo, alto)
			Escribir "la superficie es: ", superficie
			Escribir "materiales: cemento: ", cemento * superficie, "m3 de arena: ", arena * superficie, "m2 de ladrillo: ", superficie * ladrillos 
		De Otro Modo:
			Escribir "No se puede realizar esta operación, intente nuevamente"
	FinSegun
FinSubProceso

SubProceso calcularViga()
	
	Definir largoViga Como Real
	
	Escribir "Ingrese el largo de la viga en metros: "
	
	Leer largoViga
	
	Escribir "Para ", largoViga, " mts lineales se requiere: "
	
	Escribir "Cemento: ", largoViga * 9, " kg."
	
	Escribir "Arena: ", largoViga * 0.02, " m3."
	
	Escribir "Piedra: ", largoViga * 0.02, " m3."
	
	Escribir "Hierro del 8: ", largoViga * 4, " m."
	
	Escribir "Hierro del 4: ", largoViga * 3, " m."
	
FinSubProceso

SubProceso calcularColumna()
	
	Definir largoColumna, cemento, arena, piedra, hierro10, hierro4 Como Real;
	
	Escribir "Ingrese el largo de la columna en metros";
	Leer largoColumna;
	
	cemento = largoColumna * 7.5;
	arena = largoColumna * 0.016;
	piedra = largoColumna * 0.016;
	hierro10 = largoColumna * 10;
	hierro4 = largoColumna * 3;
	
	Escribir "";
	Escribir "La cantidad de materiales necesarios para la columna con un largo de ", largoColumna, "m es: ";
	Escribir "";
    Escribir "Cemento: ", cemento, " kg";
    Escribir "Arena: ", arena, " m³";
    Escribir "Piedra: ", piedra, " m²";
    Escribir "Hierro del 10: ", hierro10, " m";
    Escribir "Hierro del 4: ", hierro4, " m";
	Escribir "";
	
FinSubProceso

SubAlgoritmo calcularContrapisos()
	
	Definir espesor, ancho, largo,volumen Como Real
	
	Escribir "Ingrese en metros espesor, ancho y largo del contrapiso a calcular respectivamente"
	leer espesor, ancho, largo
	
	volumen=calcularVolumen(espesor, ancho, largo)
	
	Escribir "Para el contrapiso se necesita: " volumen*105 " kg de cemento, " volumen*0.45 " m3 de arena y " volumen*0.9 " m3 de piedra."
	
FinSubAlgoritmo

SubProceso calcularTecho()
	
	Definir altura, ancho, largo, area, cemento, arena, piedra, hierro8, hierro6 como Real
	
	Escribir "Ingrese la altura del techo en metros:"
	Leer altura
	
	Escribir "Ingrese el ancho del techo en metros:"
	Leer ancho
	
	Escribir "Ingrese el largo del techo en metros:"
	Leer largo
	area = calcularVolumen(altura, ancho, largo)
	cemento = area * 33
	arena = area * 0.072
	piedra = area * 0.072
	hierro8 = area * 7
	hierro6 = area * 4
	
	Escribir "Para un techo de ", area, " metros cubicos se necesitan:"
	Escribir cemento, " kg de cemento"
	Escribir arena, " m3 de arena"
	Escribir piedra, " m3 de piedra"
	Escribir hierro8, " m de hierro del 8"
	Escribir hierro6, " m de hierro del 6"
	
FinSubProceso

SubProceso calcularPiso()
	
	Definir ancho, largo, calculo Como Real
	
	Escribir "Ingrese el ancho y el largo de la superficie del suelo: "
	
	Leer ancho, largo
	
	calculo = calcularSuperficie(ancho, largo)
	
	Escribir "Incluidos los recortes, la superficie es de : ", calculo * 1.1, " m2."
	
FinSubProceso

SubAlgoritmo calcularPintura()
	
	Definir altura, base Como Real
	
	Escribir "Ingrese en metros la altura y la base del muro para calcular la cantidad de pintura necesaria"
	leer altura, base
	
	Escribir "Para pintar el muro se necesita " calcularSuperficie(altura, base)*1/6 " L de pintura"
	
FinSubAlgoritmo

SubProceso  calcularIluminacion()
	
	Definir Superficie, resultado, calculo Como Real;
	
	Escribir "Ingrese la superficie de la habitación: ";
	leer Superficie;
	
	calculo = Superficie * 0.20;
	
	Escribir "La cantidad minima de la superficie de iluminación natural es: ", calculo;
	
FinSubProceso
